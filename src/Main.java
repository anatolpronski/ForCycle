import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.пшеprintln("¬ведите число, которое необходимо разложить на множители");
        int value = new Scanner(System.in).nextInt();


        for (int i = 1; i <= value; i = i + 1) {


            for (int a = value; a >= 1; a = a - 1) {
                if (a * i == value) {
                    System.out.println(a + "*" + i);
                }

            }

        }
    }
}
