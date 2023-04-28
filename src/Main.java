public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            //    System.out.println(arr[i]);
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
        System.out.printf("Средняя сумма трат за месяц составила %s рублей", midleSpend);
    }

}

