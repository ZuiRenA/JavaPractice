public class FinalizeTest {
    public static void main(String[] args){
        /*FinalizeTry finalizeTry = new FinalizeTry();
        finalizeTry = null;
        System.gc();
        System.runFinalization();
        */
        new Tank();
        System.gc();
        System.runFinalization();

        new Tank().changeState(true);
        System.gc();
        System.runFinalization();
    }
}

/*class FinalizeTry{
    protected void finalize(){
        System.out.println("123123");
    }
}*/

class Tank{
    boolean state = false;
    void changeState(boolean state){
        this.state = state;
    }
    public void finalize() throws Throwable{
        if (state){
            System.out.println("满的。。。有问题");
        }else {
            System.out.println("空的。。。没问题");
        }
    }
}