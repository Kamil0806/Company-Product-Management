import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    private ArrayList<Company> companies = new ArrayList<>();

    public void addCompany(Company company) {
        companies.add(company);
    }
    public void createCompanies() {
        Scanner reader = new Scanner(System.in);

        while (true) {

            Company newCompany = new Company();
            ArrayList<Product> newCompanyProducts = new ArrayList<>();

            System.out.print("Enter new company name: ");
            String s = reader.next();
            if (s.equals("exit")) {
                System.out.println(companies);
                System.out.println(mostExpensiveCompaniesProduct());
                Main.mainMenu();
                break;
            } else
                newCompany.setCompanyName(s);
            System.out.println("Enter products of the company");
            while (true) {
                Product newProduct = new Product();
                newProduct.readProduct();
                newCompanyProducts.add(newProduct);
                System.out.print("Product added! Add more? 1 - Yes/ 2 - No: ");
                int answer = reader.nextInt();
                if (answer == 2) {
                    newCompany.setProducts(newCompanyProducts);
                    companies.add(newCompany);
                    break;
                } else
                    continue;
            }
        }
    }

    public String mostExpensiveCompaniesProduct() {
        double highestProdPrice = 0;
        String expensiveProductName = "";
        for (var comp : companies) {
            for (var prod : comp.getProducts()) {
                if (prod.getPrice() > highestProdPrice) {
                    highestProdPrice = prod.getPrice();
                    expensiveProductName = prod.getName();
                }
            }
        }
        return expensiveProductName;
    }

    public void exists() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            boolean exists = false;
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            if (productName.equals("quit")){
                Main.mainMenu();
                return;
            }
            else {
                for (var comp : companies) {
                    for (var prod : comp.getProducts()) {
                        if (prod.getName().equals(productName)) {
                            exists = true;
                        }
                    }
                }
                if (exists)
                    System.out.println("Exists");
                else
                    System.out.println("Does not exist");
            }
        }
    }
}
