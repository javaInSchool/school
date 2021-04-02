package java9.array2;

public class Main {
    public static void main(String[] args) {
        int arrayLength = (int)(Math.random()*20);
        int[] numbers = new int[arrayLength];
        System.out.println(numbers.length);
        for (int i = 0, n = numbers.length; i < n; i++){
            int power = (int)(Math.random()*2+1);
            numbers[i] = (int)(Math.random()*100*Math.pow(-1,power));
        }
        for(int temp: numbers){
            System.out.print(temp + " ");
        }
        int pos = 0, neg = 0; //кол-во положительных и отрицательных
        for (int i = 0, n = arrayLength; i < n; i++) {
            if (numbers[i] >=0){
                pos++;
            }else{
                neg++;
            }
        }
        int[] posArray = new int[pos];
        int[] negArray = new int[neg];
        pos = 0; neg = 0;
        for (int i = 0, n = arrayLength; i < n; i++) {
            if (numbers[i] >=0){
                posArray[pos] = numbers[i]; pos++;
            }else{
                negArray[neg] = numbers[i]; neg++;
            }
        }
        System.out.println();
        for(int temp: posArray){
            System.out.print(temp + " ");
        }

    }
}
