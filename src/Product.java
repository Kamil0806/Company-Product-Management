import java.util.Scanner;

public class Product {

    private String name;
    private double price;

    private String code;

    public Product() {}

    public Product( String name, double price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "Name: " + name +
               "\nPrice: " + price +
               "\nCode: " + code;
    }

    public void readProduct() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter name of product: ");
        setName(reader.nextLine());

        System.out.print("Enter price of product: ");
        setPrice(reader.nextDouble());

        System.out.print("Enter code of product: ");
        setCode(reader.next()); //TODO: impl Code type check!

    }

    public boolean compare(Product p){
        if (this.getPrice() > p.getPrice())
            return true;
        else
            return false;
    }
}
