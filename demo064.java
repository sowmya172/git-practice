public class demo064 {
    public void method(){
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
      demo064 d1=new demo064();
      d1.method();
    }}