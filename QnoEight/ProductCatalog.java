class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ". Price: Rs."+ price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;
    Electronics(String name,double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ". Price: Rs."+ price + ". Warranty Period(yrs) :" + warrantyPeriod);
    }

}

class Clothing extends Product {
    int size;
    String material;
    Clothing(String name,double price, int size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ". Price: Rs."+ price + ". Size :" + size + ". Material: " + material);
    }
}

class Grocery extends Product {
    String expiryDate;
    Grocery(String name,double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ". Price: Rs."+ price + ". Expiry Date :" + expiryDate);
    }
    }


public class ProductCatalog {
    public static void main (String[] args) {
        Electronics a = new Electronics("Phone", 100000, 1);
        Clothing b = new Clothing("Pants", 1700, 30, "cotton");
        Grocery c = new Grocery("Plant",230, "23rd June, 2025");

        a.displayDetails();;
        b.displayDetails();
        c.displayDetails();
    }
}
