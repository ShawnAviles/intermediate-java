package day12;

public class Person {

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getGreeting(){
        return "Hi, I'm " + firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName; 
    }

    public String getLastName(){
        return lastName;
    }
}