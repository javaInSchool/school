package _4_array.lesson26;

public class Main {
    public static void main(String[] args) {
        int[] n = {23, 5, 8, 7, 111, -4, 9, 0};
        int max = (int)Double.NEGATIVE_INFINITY; //найменше число
        int min = (int)Double.POSITIVE_INFINITY; //найбільше число
        //пошук найбільшого
        for (int i = 0, m = n.length; i < m; i++) {
            if(n[i] > max){
                max = n[i];
            }
        }
        System.out.println("Max = " + max);
        //пошук найменшого
        for (int i = 0, m = n.length; i < m; i++) {
            if(n[i] < min){
                min = n[i];
            }
        }
        System.out.println("Min = " + min);
        //заміна елементів місцями
        int temp = n[1];
        n[1] = n[2];
        n[2] = temp;
    }
}
