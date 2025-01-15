public class Snack{

    //instance variables about snacks
    float price;
    String[] toppings;
    int quantity;
    String name;

    //constructor to make a snack
    public snack (String name, int quantity, String[] toppings, float price) {
        this.name = name;
        this.quantity =  quantity;
        this.toppings = toppings;
        this.price = price;
    }

    //to string to show instance of a snack
    public String toString(){
        return "Snack: " + name + ", Quanity: " + quanity + " at price: $" + price;
    }

    public static void main(String[] args){
        Snack oatmeal = new Snack("oatmeal", 0, new String["brown sugar", "bananas", "cinnamon"], 0.2);
        System.out.println(oatmeal);

    }
}