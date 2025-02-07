public class demo065 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        System.out.println("Array elements after swapping first and last:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}