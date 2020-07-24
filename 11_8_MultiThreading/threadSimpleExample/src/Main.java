public class Main {
    public static void main(String[] args) {
        //1 Thread - ticket office, all wait 1
        OtherThread ot = new OtherThread();
        ot.start();
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){}
    }
}

class OtherThread extends Thread{
    public void run(){
        try{
            for (int j = 0; j < 5; j++) {
                System.out.println("j = " + j);
                Thread.sleep(1000);
            }
        }catch (Exception e){}
    }
}
