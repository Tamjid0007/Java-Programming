public class P2_17 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        Person person = new Person("Rajesh Modi",29, "Near Gokul hospital,Rajkot");

        person.introduce();

        person.setAge(39);

        System.out.println("Updated age: " + person.getAge());
    }
}