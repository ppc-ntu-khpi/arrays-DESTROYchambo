package test;

import domain.Exercise;
import java.util.Scanner;

/**
 * Головний клас
 * @author Oleksandr
 */
public class TestResult {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Vvedit pochatok: ");
        int chislo1 = scan.nextInt();

        System.out.print("Vvedit kinec: ");
        int chislo2 = scan.nextInt();

        Exercise.Calculate(chislo1, chislo2);
    }
}
