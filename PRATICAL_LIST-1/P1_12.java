
public class P1_12 {
    public static void main(String s[]) {
        int[] element = { 17, 90, 77, 98, 68 };

        System.out.println("iterating over an array using for loop in Java:");

        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }

        System.out.println("iterating over an array using forEach() loop in Java:");
        for (int var : element) {
            System.out.println(var);
        }
    }
}