package UI;

import java.awt.*;

import UI.FarmaTodoGUI;
import UI.LoginGUI;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenuGUI extends JFrame{

    public MainMenuGUI(){
        setSize(400, 600);
        setBackground(Color.cyan);
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton catalogButton=new JButton("View Catalog");
        JButton clientButton=new JButton("Manage Clients");
        JButton exitButton=new JButton("Exit");

        catalogButton.addActionListener(e ->{
            new FarmaTodoGUI().setVisible(true);
            this.dispose();
        });

        clientButton.addActionListener(e->{
        });

        exitButton.addActionListener(e->{
            System.exit(0);
        });

        add(catalogButton);
        add(clientButton);
        add(exitButton);
    }
}
