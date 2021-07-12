//单例模式：饿汉模式
public class HungerySingleton {
    //加载的时候就产生的实例化对象
    private static HungerySingleton instance = new HungerySingleton();

    private HungerySingleton() {
    }

    //返回实力对象
    public static HungerySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
//        HungerySingleton hungerySingleton=HungerySingleton.getInstance();
//        System.out.println(hungerySingleton);
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(HungerySingleton.getInstance());
            }).start();

        }
    }
}
