package java9.array;

public class Main2 {
    public static void main(String[] args) {
        int[] number1 = {-3, 6, 4};
        int[] number2 = {6, 12, -4, 8, -3};
        int[] result = new int[number1.length+
                number2.length];
        System.out.println(result.length);
        for (int i=0, n = number1.length ; i<n ; i++){
            result[i] = number1[i];
        } // result = {-3, 6, 4, 0,0,0,0,0}
        for (int i=number1.length, n = result.length ; i<n ; i++){
            result[i] = number2[i-number1.length];
            //result[3] = number2[3-3]
        }// result = {-3, 6, 4, 6,12,-4,8,-3}
        for (int temp: result) {
            System.out.print(temp + " ");
        }
    }
}
