public class EnumSingletonDemo {
    private EnumSingletonDemo(){
    }
    //延迟加载
    private enum EnumHolder{
        INSTANCE;
        private static  EnumSingletonDemo instance=null;

        private EnumSingletonDemo getInstance(){
            instance=new EnumSingletonDemo();
            return instance;
        }
    }//懒加载
    public static EnumSingletonDemo  getInstance(){
        return EnumHolder.INSTANCE.instance;
    }

}