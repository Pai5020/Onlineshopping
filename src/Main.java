public class Main {
    public static void main(String[] args) {

        User ur = new User("ABC",22);
        System.out.println("Customer name : " + ur.getName());
        System.out.println("Customer age : " + ur.getAge());
        ur.browseP();
        ur.addItems();
        ur.checkoutItems();

    }
}