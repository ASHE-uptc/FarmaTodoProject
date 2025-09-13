import java.time.LocalDate;
import java.util.Scanner;
import model.ProductLoader;
import model.Person;
import model.Product;
import model.Order;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ent=new Scanner(System.in);

        List<Product> catalog=ProductLoader.LoadProducts("src/catalog.txt");
        Person client_1=Person.register(); //Register of client
        client_1.cli_showInfo();//Shows Client information

        System.out.println("This is our catalog:"+"\n"); 
        for (Product p : catalog) {System.out.println(p);} //Shows Catalog

        //System.out.println("\nHi "+client_1.getName()+"!"); 
        System.out.println("This is our catalog:"+"\n"); 
        for (Product p : catalog) {System.out.println(p);} //Shows Catalog

        Order order_1=new Order(101, LocalDate.now());
        order_1.AddProduct(null);;
        order_1.ShowOrder();
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Total Cost: $"+order_1.TotalCost());
        System.out.println("Order Expiration: "+LocalDate.now().plusDays(1));
        System.out.println("Order Expiration: "+LocalDate.now().plusDays(1));
        }
}