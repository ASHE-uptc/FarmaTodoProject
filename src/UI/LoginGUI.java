package UI;

import javax.swing.*;

import model.Druggist;


public class LoginGUI extends JFrame {
    public static void main(String[] args) {
        Druggist druggist_1=new Druggist("Axel", 'T', "1057980717", "user", "1234");

        boolean logged=false;

        while (!logged) {
            //Ask User
            String log_user=JOptionPane.showInputDialog(null, "Enter username:", "Login", JOptionPane.QUESTION_MESSAGE);

            if (log_user == null) { // Cancel
                System.exit(0);
            }

            //Ask Password
            JPasswordField pf = new JPasswordField();
            int option = JOptionPane.showConfirmDialog(null, pf, "Enter password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (option!=JOptionPane.OK_OPTION) {
                System.exit(0);
            }

            String pass=new String(pf.getPassword());

            //Validate
            if (log_user.equals(druggist_1.getDruggist_user())&&pass.equals(druggist_1.getDruggist_password())) {
                JOptionPane.showMessageDialog(null, "Log in successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                logged=true;

            SwingUtilities.invokeLater(() -> { //Shows catalog
                    new UI.MainMenuGUI().setVisible(true);
                });
            }else{ 
                JOptionPane.showMessageDialog(null, "Invalid Credentials", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
