package _7_polimorfizm.lesson69_this;

public class Figure {
    int x, y, z;

    Figure(int x, int y, int z){
        this.x = x;  this.y = y;
        this.z = z;
        System.out.println("4 constr");
    }
    Figure(int x, int y){
        this(x,y,0);
        System.out.println("3 constr");
        //x = i;  y = j;
    }

    Figure(int x){
        this(x,x);
        System.out.println("2 constr");
        //x = i; y = i;
    }

    Figure(){
        this(0);
        System.out.println("1 constr");
        //this(9,7); compile error
        //x = 0; y = 0; z = 0;
    }
    void display(){
        //this(0,0);  compile error
    }
}
