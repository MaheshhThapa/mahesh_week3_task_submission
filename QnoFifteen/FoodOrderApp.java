class FoodItem{
    private String name;
    private double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   
    void displayMenuItem() {
        System.out.println("Name :" + getName() + ". Price " + getPrice());
    }
}
class Pizza extends FoodItem {
    String size;
    String[] toppings;

    Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.print("Pizza: " + getName() + ", Size: " + size + ", Toppings: ");
            for (String topping : toppings) {
                System.out.print(topping + ", ");
            }
            System.out.println(", Price: " + getPrice());
}
}

class Burger extends FoodItem{
    int cheese;
    String pattyType;

    Burger(String name, double price, int cheese, String pattyType){
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.print("Burger: " + getName() + ", No. of cheese slice: " + cheese + ", Patty Type: "+ pattyType);
        System.out.println(", Price: " + getPrice());
    }
}

class Salad extends FoodItem {
    String[] ingredients;

    Salad(String name, double price, String[] ingredients){
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void displayMenuItem() {
        System.out.print("Salad: " + getName() +", Ingredients: ");
        for (String ingre : ingredients) {
            System.out.print(ingre + " ");
        }
        System.out.println(", Price: " + getPrice());
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem[] menu = new FoodItem[3];
        menu[0] = new Pizza("Chicken pizza", 1500, "14 inch", new String[]{"pepe","roni"});      
        menu[1] = new Burger("Cheese burger", 300, 2, "chicken");
        menu[2] = new Salad("Caesar salad", 200, new String[]{"Tomato","Cucumber","Carrot"});

        menu[0].displayMenuItem();
        System.out.println();
        menu[1].displayMenuItem();
        System.out.println();
        menu[2].displayMenuItem();
    }

}
