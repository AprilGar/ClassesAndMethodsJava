public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Colin", "Bathgate");
        Person person2 = new Person("Anna", "Glasgow");

////        System.out.println("person 1 name: " + person1.name);
////        System.out.println("person 2 name: " + person2.name);
//
//        person1.greet("afternoon"); // () show we are calling a method not giving a property
//
//        String person1Bio = person1.generateBio();
//        String person2Bio = person2.generateBio();
//
//        System.out.println(person1Bio); //can use method chaining eg. .toUpperCase
//        System.out.println(person2Bio);

        // This allows you to access private method
        System.out.println(person1.getName());
        
        // This allows you to change a private property
        person1.setName("Richard");
        System.out.println(person1.getName());
    }
}
