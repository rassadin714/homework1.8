public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        System.out.println("Задача 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers[0]);
        System.out.println(fractionalNumbers[1]);
        System.out.println(fractionalNumbers[2]);

        int[] bananas = new int[10];
        bananas[0] = 12;
        bananas[1] = 9;
        bananas[2] = 1;
        bananas[3] = 8;
        bananas[4] = 5;
        bananas[5] = 22;
        bananas[6] = 11;
        bananas[7] = 13;
        bananas[8] = 4;
        bananas[9] = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(bananas[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < (numbers.length - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.print(fractionalNumbers[0] + ",");
        System.out.print(fractionalNumbers[1] + ",");
        System.out.print(fractionalNumbers[2]);
        System.out.println();

        int[] bananas = new int[10];
        bananas[0] = 12;
        bananas[1] = 9;
        bananas[2] = 1;
        bananas[3] = 8;
        bananas[4] = 5;
        bananas[5] = 22;
        bananas[6] = 11;
        bananas[7] = 13;
        bananas[8] = 4;
        bananas[9] = 5;
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(bananas[i]);
                break;
            }
            System.out.print(bananas[i] + ",");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[2] + ",");
        System.out.print(numbers[1] + ",");
        System.out.print(numbers[0]);
        System.out.println();

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.print(fractionalNumbers[2] + ",");
        System.out.print(fractionalNumbers[1] + ",");
        System.out.print(fractionalNumbers[0]);
        System.out.println();

        int[] bananas = {12, 9, 1, 8, 5, 22, 11, 13, 4, 5};
        for (int i = bananas.length - 1; i > -1; i--) {
            System.out.print(bananas[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.print(arr[i]);
        }
    }
}