package java7.src.if_example;
/*
Дано два числа А и B, написать программу, которая будет выводить
знак > , когда А больше B
знак < , когда А меньше B
знак = , когда А равно B
 */
public class Main {
    public static void main(String[] args) {
        int a = 44;
        int b = 9;
        if(a > b){
            System.out.println(">");
        }else{
            if(a < b){
                System.out.println("<");
            }else{
                System.out.println("=");
            }
        }
    }
}
