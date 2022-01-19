import java.util.Scanner;

public class Calculate {

    public static void sumNum (int A, int B){
        int result = A + B;
        System.out.println("Выражение " + A + " + " + B + " = " + result);
    }
    public static void minusNum (int A, int B){
        int result = A - B;
        System.out.println("Выражение " + A + " - " + B + " = " + result);
    }

    public static void umnogNum (int A, int B){
        int result = A * B;
        System.out.println("Выражение " + A + " * " + B + " = " + result);
    }

    public static void delenieNum (int A, int B){
        int result = A / B;
        System.out.println("Выражение " + A + " / " + B + " = " + result);
    }
}
