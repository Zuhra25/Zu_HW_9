public class Main {
    public static void main(String[] args) {
       // task1();
        task2();
    }
    public static int[] generateRandomArray () {
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
            System.out.printf("Сумма трат за месяц составила %s рублей %n", arr[i] );
    }
    public static void task2() {
        System.out.println("Задача 1:");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
            System.out.printf("Сумма трат за месяц составила %s рублей %n", sum);
    }



}