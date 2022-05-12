import java.util.*;


public class Main {
    //Variables
    static float num1, num2;


    public static void main(String[] args) {
        System.out.println("Please enter your fist number: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextFloat();
        System.out.println("Please enter your second number: ");
        num2 = input.nextFloat();
        System.out.println("Please enter your sign number: ");
        String sign = input.next();
        signs(sign);
    }

    //math signs
    public static void signs(String a) {

        if (a.equals("+")) {
            plus(num1, num2);
        }
        if (a.equals("-")) {
            sub(num1, num2);
        }
        if (a.equals("*")) {
            mult(num1, num2);
        }
        if (a.equals("/")) {
            div(num1, num2);
        }
        if (a.equals("%")) {
            remainder(num1, num2);
        }

    }

    //calculation
    public static void plus(float x, float y) {
        float sum = x + y;
        System.out.println("sum " + sum);
    }

    public static void sub(float x, float y) {
        float sub = x - y;
        System.out.println("substance " + sub);
    }

    public static void mult(float x, float y) {
        float mult = x * y;
        System.out.println("multiply " + mult);
    }

    public static void div(float x, float y) {
        float div = x / y;
        System.out.println("divide " + div);
    }


    public static void remainder(float x, float y) {
        float remain = x % y;
        System.out.println("remainder " + remain);
    }
}
