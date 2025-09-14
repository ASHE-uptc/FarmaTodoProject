

import javax.swing.SwingUtilities;

import UI.FarmaTodoGUI;
import UI.LoginGUI;
import model.Druggist;
import model.ProductLoader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Druggist> druggList=ProductLoader.LoadDruggists("src/druggistList.txt");
        SwingUtilities.invokeLater(()->{
            LoginGUI.startLogin();
        });
}}