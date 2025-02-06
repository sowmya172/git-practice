public class demo063 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        if(array.length >=0) {
            int Firstelement = array[0];
            int Lastelement = array[array.length - 1];

            int sum = Firstelement + Lastelement;

            System.out.println("1st element: " + Firstelement);
            System.out.println("Last element: " + Lastelement);
            System.out.println("Sum of 1st and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}