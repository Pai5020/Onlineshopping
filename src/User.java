public class User extends Shopping {

    public User(String name, int age){
        super(name, age);
    }
    public void browseP(){
        System.out.println("The user can browse details");
    }
    public void addItems(){
        System.out.println("Items are added to the cart");
    }
    @Override
    public void checkoutItems() {
        System.out.println("The items in Checkout....");
    }
}
