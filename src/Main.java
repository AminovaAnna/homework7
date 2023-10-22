public class Main {
    public static void main(String[] args) {
        {
            int accumMoney = 0;
            int monthPay = 15_000;
            int i = 0;
            while (accumMoney < 2_459_000) {
                accumMoney = accumMoney + accumMoney/100;
                accumMoney = accumMoney + monthPay;
                i++;
                System.out.println("Месяц " + i + " сумма накоплений равна " + accumMoney + " рублей");
            }
        }       //задача1
        System.out.println( );
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print (i + " ");
            }
            System.out.println( );
            if (i == 10) {
              for (; i > 0; i--) {
                  System.out.print (i + " ");
              }
            }
        }       //задача2
        System.out.println( );
        System.out.println( );
        {
            int peopleTotal = 12_000_000;
            int birthRatePerThousand = 17;
            int deathRatePerThousand = 8;
            for (int i = 1; i <= 10; i++) {
                peopleTotal = peopleTotal + (birthRatePerThousand * peopleTotal/1000) - (deathRatePerThousand * peopleTotal/1000);
                System.out.println("Год " + i + " численность населения составит " + peopleTotal );
            }

        }       //задача3
        System.out.println( );
        {
            int total = 15000;
            int savings = 0;
            int i = 0;
            while (total < 12_000_000) {
                i++;
                savings = total * 7 / 100;
                total = total + savings;
                System.out.println("Месяц " + i + ": Сумма " + total);
            }
        }       //задача4
        System.out.println( );
        {
            int total = 15000;
            int savings = 0;
            int i = 0;
            while (total < 12_000_000) {
                i++;
                savings = total * 7 / 100;
                total = total + savings;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ": Сумма " + total);
                }
            }
        }       //задача5
        System.out.println( );
        {
            int total = 15000;
            int savings = 0;
            for ( int i = 0; i <= 9 * 12; i++){
                savings = total * 7 / 100;
                total = total + savings;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ": Сумма " + total);
                }
            }

        }       //задача6
        System.out.println( );
        {


            int day = 6;
                for (;day <= 31; day= day+7){
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
        }       //задача7
        System.out.println( );
        {

            int yearNow = 2023;
            int yearStart = yearNow - 200;
            int yearFinish = yearNow + 100;
            int year = 0;
            while(year != yearFinish) {
                year++;
                if (year >= yearStart && year % 79 == 0){
                    System.out.println(year);
                }

            }   //задача8
        }

    }
}