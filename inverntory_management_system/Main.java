import java.lang.String;
import java.util.Vector;

abstract class Item
{
    public Item(final String id,final String name,final double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    protected String id;
    protected String name;
    protected double price;

    public abstract String getDetails();
    public void displayInfo()
    {
        System.out.println("id of item is " + id);
        System.out.println("name of item is " + name);
        System.out.println("price of item is " + price);
    }
}

class Electronics extends Item
{
    public Electronics(final String id,final String name,final double price,final int warranty)
    {
        super(id, name, price);
        this.warranty = warranty;
    }
    private int warranty;
    public String getDetails()
    {
        String res = String.valueOf(warranty);
        return res;
    }
}

class Clothing extends Item
{
    public Clothing(final String id,final String name,final double price,final String size)
    {
        super(id, name, price);
        this.size = size;
    }
    private String size;
    public String getDetails()
    {
        return size;
    }
}

class Food extends Item
{
    public Food(final String id,final String name,final double price,final String expiryDate)
    {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }
    private String expiryDate;
    public String getDetails()
    {
        return expiryDate;
    }
}

class Inventory<T extends Item>
{
    private Vector<T> elements;
    public Inventory()
    {
        elements = new Vector<T>();
    }
    public void addItem(T item)
    {
        elements.add(item);
        System.out.println(item.name + " added into list");
    }
    public void removeItem(final String id)
    {
        elements.removeIf(item -> item.id.equals(id));
        System.out.println(id + " removed from list");
    }
    public void printAllItems()
    {
        for(var x : elements)
        {
            x.displayInfo();
            System.out.println(x.getDetails());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an inventory for items
        Inventory<Item> inventory = new Inventory<>();

        // Create some items
        Electronics laptop = new Electronics("E001", "Laptop", 1200.99, 2);
        Clothing shirt = new Clothing("C001", "T-Shirt", 19.99, "M");
        Food apple = new Food("F001", "Apple", 0.99, "2025-01-15");

        // Add items to the inventory
        inventory.addItem(laptop);
        inventory.addItem(shirt);
        inventory.addItem(apple);

        // Print all items in the inventory
        inventory.printAllItems();

        // Remove an item by ID
        inventory.removeItem("C001");

        // Print all items after removal
        inventory.printAllItems();
    }
}