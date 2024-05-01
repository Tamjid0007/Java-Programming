public class Perdon {
    private String name;
    private int age;
    private String address;

    public Perdon(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + ". I am " + age + " years old and I live at " + address + ".");
    }
    public static void main(String[] args) {
        Perdon person = new Perdon("John Doe", 25, "123 Main St");

        person.introduce();

        person.setName("Jane Smith");
        person.setAge(30);
        person.setAddress("456 Oak Ave");

        person.introduce();
    
}

}