import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import UI.FarmaTodoGUI;
import model.ProductLoader;
import model.Person;
import model.Product;
import model.Order;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(()->{
            

            new FarmaTodoGUI().setVisible(true);
        });
        }
}