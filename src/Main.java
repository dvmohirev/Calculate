import java.util.Scanner;

public class Main {
    static char plus = '+';
    static char minus = '-';
    static char umnog = '*';
    static char delenie = '/';

    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        char znak = ' ';
        boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);
        while(!isTrue){
            String line = scanner.nextLine();

            String newLine = line.replaceAll("\\d", "").trim();
            znak = newLine.charAt(0);
            try{
                A = Integer.parseInt(line.substring(0, line.indexOf(znak)));
                B = Integer.parseInt(line.substring(line.indexOf(znak)+1));
                isTrue = true;
            }catch (Exception e){
                System.out.println("Ошибка! Введите выражение заново");
            }
        }

        if (znak == plus){
            Calculate.sumNum(A, B);
        } else if (znak == minus){
            Calculate.minusNum(A, B);
        } else if (znak == umnog){
            Calculate.umnogNum(A, B);
        } else if (znak == delenie){
            Calculate.delenieNum(A, B);
        }
    }
}
