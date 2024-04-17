public abstract class Shopping {
    String name;
    int age;
    public Shopping(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract void browseP();
    public abstract void addItems();
    public abstract void checkoutItems();
}
