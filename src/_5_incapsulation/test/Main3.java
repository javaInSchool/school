package test;

public class Main3 {
    public static void main(String[] args) {
        new KeeperSecond();
        System.out.println(new KeeperFirst().c +
                new KeeperFirst().d);
    }
}

class KeeperFirst{
    static int c;
    static double d;
    KeeperFirst(){
        new KeeperSecond();
        KeeperSecond ks;
    }
}
class KeeperSecond{
    KeeperSecond(){
        KeeperFirst.c+=3;
        KeeperFirst.d+=4;
    }
}