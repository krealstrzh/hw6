import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание 1
        int[] expensesMonth = generateRandomArray();
        int expensesSum = 0;
        for (int i = 0; i < expensesMonth.length-1; i++) {
            expensesSum = expensesMonth [i] + expensesSum;
        }
        System.out.println("Сумма трат за месяц составила " + expensesSum +" рублей");
        //Задание 2
        int maxExpenses = expensesMonth[0];
        int minExpenses = expensesMonth[0];
        for (int a = 0; a < expensesMonth.length-1; a++) {
            final int currentMaximum = expensesMonth[a];
            if (currentMaximum > maxExpenses) {
                maxExpenses = currentMaximum;
                //System.out.println(maxExpenses);
            }
            final int currentMinimum = expensesMonth[a];
            if (minExpenses > expensesMonth[a]) {
                minExpenses = currentMinimum;
                //System.out.println(minExpenses);
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        //Задание 3
        double expensesMedium = 1.0 * expensesSum / expensesMonth.length;
        System.out.println("Средняя сумма трат составляет " + expensesMedium + " рублей");
        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char letter;
        for (int c = 0; c < reverseFullName.length / 2; c++) {
            letter = reverseFullName[reverseFullName.length - c - 1];
            reverseFullName[reverseFullName.length - c - 1] = reverseFullName[c];
            reverseFullName[c] = letter;
        }
        //System.out.println(Arrays.toString(reverseFullName));
        for (char d : reverseFullName) {
            System.out.print(d);
        }
    }
}