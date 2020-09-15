package _4_array.example7;

public class Main {
    public static void main(String[] args) {
        int[][][] x = {
                { //0
                    {4,7,9},    //00
                    {-3,0,-12}, //01
                    {4, -5}     //02
                },

                { //1
                    {4,7,9},    //00
                    {-3,0,-12}, //01
                    {4, -5}     //02
                }
        };
        System.out.println(x[0][1][1]);
    }
}
