public class HW_3 {
    public static void main(String[] args) {


        int a = 2;
        int b = 6;

        if (a == b) {
            System.out.println(" a = b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }



        int c = (a + b);

        if (c % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variables is odd");
        }

        int d = 8;

        if (d > 10){
            System.out.println("Переменная больше 10");
        }

        if (d < 100){
            System.out.println("Переменная меньше 100");
        }

        if (d * 1.00 / 2 > 20){
            System.out.println("Результат деления на 2 больше 20");
        }

        if (5 <= d && d <= 40){
            System.out.println("Результат деления на 2 больше 20");
        }

        if (5 <= d && d <= 40){
            System.out.println("Значение переменной между 5 и 40 включительно");
        }

    }
}
