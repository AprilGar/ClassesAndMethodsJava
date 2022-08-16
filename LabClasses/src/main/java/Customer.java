public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer(String firstName, String lastName, int id, double heldMoney) {}

    // The below generates a random number
    public static void main(String[] args) {
        int min = 01;
        int max = 1000;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
    }


}
