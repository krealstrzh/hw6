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
        System.out.println();
//        Задание 5
        int [][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][matrix.length-1-i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
//        Задание 6
        int[] arr = {5, 4, 3, 2, 1};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
//        Задание 7
        int fromArray;
        for (int i = 0; i < arr.length/2; i++) {
            fromArray = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = fromArray;
        }
        System.out.println(Arrays.toString(arr));
//        Задание 8
        int[] firArr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int C;
        int D;
        int summ;
            for (int k = 0; k < firArr.length - 1; k++) {
                D = firArr[k];
                summ = firArr[0] + D;
                if (summ == -2) {
                    System.out.println("Искомая пара чисел -- " + firArr[0] + " и " + D);
                }
            }
//        Задание 9
        int[] secArr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum;
        int A;
        int B;
        for (int i = 0; i < secArr.length-1; i++) {
            A = secArr[i];
            for (int k = 0; k < secArr.length-1; k++) {
                B = secArr[k];
                sum = A + B;
                if (sum == -2) {
                    System.out.println("Пара чисел -- " + A + " и " + B);
                }
            }
        }
    }
}