public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++)
            sum += arr[index];
        System.out.println("Сумма трат за месяц " + sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int element : arr) {
            if (element < minValue) {
                minValue = element;
            } else if (element > maxValue) {
                maxValue = element;
            }
        }
        System.out.println("Минимальные траты за день: " + minValue);
        System.out.println("Максимальные траты за день: " + maxValue);

    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
            }
        System.out.println(sum / (float) arr.length);
        }
    }







