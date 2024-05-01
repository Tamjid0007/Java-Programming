class P45_16{
    public static void main(String args[]) {
        try {
            int[] arr = { 1, 2, 3 };

            System.out.println("Value at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
