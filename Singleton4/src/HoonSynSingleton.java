//懒汉模式
public class HoonSynSingleton {
    private static HoonSynSingleton instance = null;

    private HoonSynSingleton() {

    }

    public static HoonSynSingleton getInstance() {
        if (null == instance) {
            synchronized (HoonSingleton.class) {
                if (null == instance) {
                    instance = new HoonSynSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(HoonSynSingleton.getInstance());
        }
    }
}
