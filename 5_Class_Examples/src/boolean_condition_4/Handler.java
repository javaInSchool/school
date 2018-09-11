/*
Урок 4. Операции сравнения. Логические переменные. Операторы if и if-else
Учень знайомиться із змінними логічного типу (boolean),
що утворюються в результаті виконання операцій порівняння цілих
або дробових чисел. Використовує оператори розгалуження if та if-else.
 */

package boolean_condition_4;

public class Handler {
    public static void main(String[] args) throws InterruptedException {
        boolean a = 4<5;
        boolean b = 5>6;
        boolean c = 5!=1;
        System.out.println(c);

        int price = 20;
        int money = 1000;

        if(money >= price){
            System.out.println("Ура мороженное!!!");
        }else{
            System.out.println("Не хватает на мороженное");
        }

        //text game
        int myHP = (int) (Math.random()*100) + 1;
        System.out.println(myHP);

        int monsterHP = (int) (Math.random()*100) + 1;
        System.out.println(monsterHP);

        int yourHeat = (int) (Math.random()*10) + 1;
        System.out.println(yourHeat);

        int monsterHeat = (int) (Math.random()*10) + 1;
        System.out.println(monsterHeat);

        while(myHP > 0 && monsterHP > 0){
            System.out.println("MyHP: " + myHP + " vs " + "MonsterHP: " + monsterHP);
            System.out.println("You heat: " + yourHeat + " vs " + "MonsterHeat: " + monsterHeat);
            myHP = myHP - monsterHeat;
            monsterHP = monsterHP - yourHeat;
            yourHeat = (int) (Math.random()*10) + 1;
            monsterHeat = (int) (Math.random()*10) + 1;
            Thread.sleep(1000L);
        }
        if(myHP<=0){
            System.out.println("You looser!!! You loose a battle!");
        }else{
            System.out.println("You win!!! Congratulations!!!");
        }
    }
}

/*
HOMEWORK TEST

1. Що буде виведено в результаті виконання коду?
        int x = 11;
        int y = 110;
        boolean b = x < y;
        System.out.println(b);
        System.out.println(x != y);

        None        None        None        None        None
        true        true        false       false       Помилка компіляції
        true        false       true        false
*/
