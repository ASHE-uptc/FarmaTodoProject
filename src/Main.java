

import javax.swing.SwingUtilities;

import UI.FarmaTodoGUI;
import UI.LoginGUI;
import model.Druggist;
import model.FilesLoader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(()->{
            LoginGUI.startLogin();
        });
}}