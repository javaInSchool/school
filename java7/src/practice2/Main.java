package practice2;
/*
Дано длинна трех отрезков: a, b, c.
Можно ли построить по этим отрезкам треуголльник?
Пример: a = 5; b = 4; c = 3;   YES
Пример: a = 9; b = 4; c = 3;   NO
        a = 5; b = 3; c = 4;   YES
        a = 5; b = 9; c = 4;   NO
        a = 4; b = 3; c = 5;   YES
        a = 5; b = 3; c = 9;   NO
 */










public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        if(a + b > c) {
            if(b + c > a){
                if(a + c > b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}






/*
        int a = 5;
        int b = 4;
        int c = 3;
        if(a + b > c) {
            if(b + c > a){
                if(a + c > b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
 */