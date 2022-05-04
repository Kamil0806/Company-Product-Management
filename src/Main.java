import java.util.Scanner;

public class Main {
    static ProductManagement productManager = new ProductManagement();
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - Create new companies\n2 - Check if product exists\n");
        int answer = scanner.nextInt();
        if (answer == 1)
            productManager.createCompanies();
        if (answer == 2)
            productManager.exists();

    }
}
