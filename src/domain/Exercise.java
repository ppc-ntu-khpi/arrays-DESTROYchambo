package domain;

/**
 * Метод Calculate класу Exercise 
 * містить у собі обчислення щасливого білету на трамвай. 
 * Виводить ці білети та іхню кількість
 * @author Oleksandr
 */
public class Exercise {

    public static void Calculate(int chislo1, int chislo2) {
        int count = 0;

        for (int nomer = chislo1; nomer <= chislo2; nomer++) {
            int[] digits = new int[6];
            int temp = nomer;

            //розбиття на окремі цифри 
            for (int i = 5; i >= 0; i--) {
                digits[i] = temp % 10;
                temp /= 10;
            }

            //перевірка на щасливий білет
            if (digits[0] + digits[1] + digits[2] == digits[3] + digits[4] + digits[5]) {
                count++;
                System.out.println("Ticket: " + nomer);
            }
        }

        System.out.println("Count: " + count);
    }
}
