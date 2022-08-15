package day12;

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person ("Grace", "Lee");
        Student s = new Student ("Jeffery", "Long", 2021);
        Teacher t = new Teacher ("Bryan", "Repass", "Computer Science");

        //
        // These methods call toString for each object. Note that Person did not override
        // toString so we ssee the object's address in memory
        //
        //
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);

        t.setLastName("Respass");

        System.out.println(p.getGreeting());
        System.out.println(s.getGreeting());
        System.out.println(t.getGreeting());
    }
}