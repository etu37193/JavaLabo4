package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FenetrePrincipale extends JFrame {
    private Billard billard;
    private Container container;

    public FenetrePrincipale(){
        super("Billard");
        setBounds(300,300,800,500);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        billard = new Billard(new Paroi(300,10,10,10), new Paroi(300,10,500,10),new Paroi(10,500,10,10), new Paroi(10,500,10,300));

        container = this.getContentPane();
        container.add(billard);

        setVisible(true);
    }
}
