//懒汉模式
public class HoonSingleton {
    private static HoonSingleton instance = null;

    private HoonSingleton() {

    }

    public static HoonSingleton getInstance() {
        if (null == instance) {
            instance = new HoonSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(HoonSingleton.getInstance());
        }
    }
}
