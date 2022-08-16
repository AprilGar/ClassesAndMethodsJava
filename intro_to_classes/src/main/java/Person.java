import java.util.Date;

public class Person {

    //declare variables that will represent properties (type and name only)
    private String name; //declare them as private stops everyone being able to change
    private String town;
    private int age;

    //create a constructor method - inside () give parameters of what to expect (data type and name). MUST BE PUBLIC
    public Person(String newPersonName, String newPersonTown){
        this.name = newPersonName; //tell the program what/where 'name' needs to pull info from
        this.town = newPersonTown;
        this.age = 0; //age will always start from 0, only give this when it is the same for every person.
    }

    //METHODS (2 parts: signature and body). This is a 'Single responsibility method' (does 1 thing only)

    public void greet(String timeOfDay){ //this is signature. void means it won't give anything back (could use int or string etc)
        //method body lives in here between {}
        System.out.println("Good " + timeOfDay + "!");
    }

    public String generateBio(){
        return "My name is " + this.name + " and I live in " + this.town + "."; //must use 'return' keyword to get something back!
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
