import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String companyName;
    private ArrayList<Product> products = new ArrayList<>();

    public Company() {}

    public Company(String companyName, ArrayList<Product> products) {
        this.companyName = companyName;
        this.products = products;
    }

    public int getNumOfProducts() {
        return products.size();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String toString() {
        return "Company name: " + companyName + "\nProducts" + products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
