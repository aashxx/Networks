import java.util.Scanner;

class Echo {
    public static void main(String[] args) {
        String data;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data:");
        data = scan.nextLine();
        System.out.println("Data entered is "+data);
        scan.close();
    }
}