public class P2_11 {
    
public static void main(String[] args) 
{
        Person person = new Person("John Doe", 25, "123 Main St, Anytown, USA");

        person.introduce();

        person.setAge(26);

        System.out.println("Updated age: " + person.getAge());
    }
}