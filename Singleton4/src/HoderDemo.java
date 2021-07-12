public class HoderDemo {
    private HoderDemo(){

    }
    private static class Holder{
        private static HoderDemo instance = new HoderDemo();
    }
    public static HoderDemo getInstance(){
        return Holder.instance;
    }
}
