public class P1_11 {
    public static void main(String[] args) {
        int[] arr = new int[] { 8, 4, 30, 41 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}