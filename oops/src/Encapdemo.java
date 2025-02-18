// encapsulation is hidding data and its datasecurity
class Person {
    private String name;
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
}

public class Encapdemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Murugan");
        System.out.println("Person's Name: " + p1.getName());
    }
}
