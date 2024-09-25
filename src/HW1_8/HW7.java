package HW1_8;

public class HW7 {
    public static void main(String[] args){
        int a = 4;
        int b = 5;

        System.out.println(sumNumbers(a, b));
        System.out.println(subNumbers(a, b));
        System.out.println(mulNumbers(a, b));
        System.out.println(divideNumbers(a, b));
        System.out.println(checkOdd(a));
    }
    public static int sumNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static int subNumbers(int num1, int num2){
        return num1 - num2;
    }

    public static int mulNumbers(int num1, int num2){
        return num1 * num2;
    }

    public static int divideNumbers(int num1, int num2){
        return num1 / num2;
    }
    // проверить число на четное/нечетное. Если четное - true, если нечетное - false
    public static Boolean checkOdd(int number){
        if ( number % 2 ==0){
            return true;
        } else return false;
    }

}
