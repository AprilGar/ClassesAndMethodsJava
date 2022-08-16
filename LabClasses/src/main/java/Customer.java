public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public static void main(String[] args) {
        // Random number generator
        int min = 01;
        int max = 1000;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
    }

    public Customer(String firstName, String lastName, int random_int, double heldMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = (random_int);
        this.heldMoney = heldMoney;
    }
}

