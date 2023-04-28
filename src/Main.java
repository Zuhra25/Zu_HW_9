public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void task1() {
        System.out.println("Задача 1:");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++)
            System.out.printf("Сумма трат за месяц составила %s рублей %n", arr[i]);
    }


    public static void task2() {
        System.out.println("Задача 2:");
        int[] arr = generateRandomArray();
        int maxSpend = 0;
        int minSpend = arr[0];
        for (final int current : arr) {
            if (current > maxSpend) {
                maxSpend = current;
            } else if (minSpend > current)
                minSpend = current;
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. %nМаксимальная сумма трат за день составила %s рублей %n", minSpend, maxSpend);
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        double midleSpend = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей %n", midleSpend);
    }
    public static void task4() {
        System.out.println("Задача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i >=0; i--)
            System.out.print(reverseFullName[i]);
    }
}

