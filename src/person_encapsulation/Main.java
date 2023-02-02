package person_encapsulation;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Shourav Molla");
        p1.setDesignation("Senior Developer");
        p1.setAge(25);
        System.out.println("Name is: "+p1.getName());
        System.out.println("Name is: "+p1.getDesignation());
        System.out.println("Name is: "+p1.getAge());
    }
}
