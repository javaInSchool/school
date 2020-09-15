package practice4;

public class Main {
    public static void main(String[] args) {
        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;
        int[] myNumbers={21, 5, -5, 4, 29, 31, 0};

        for (int i = 0 , n = myNumbers.length; i < n; i++){
            if (myNumbers[i] < min){
                min = myNumbers[i];
            }
        }
        System.out.println("Min = "+min);

        for (int i = 0 , n = myNumbers.length; i < n; i++){
            if (myNumbers[i] > max){
                max = myNumbers[i];
            }
        }
        System.out.println("Max = "+max);
    }
}
