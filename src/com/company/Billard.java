package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Billard extends JPanel {
    private List<Paroi> paroisVerticales;
    private List<Paroi> paroisHorizontales;
    private Balle balle;

    public Billard(Paroi paroiv1, Paroi paroiv2, Paroi paroih1, Paroi paroih2){
        ArrayList<Paroi> paroisV = new ArrayList<>();
        ArrayList<Paroi> paroisH = new ArrayList<>();

        this.paroisVerticales = Collections.synchronizedList(paroisV);
        this.paroisHorizontales = Collections.synchronizedList(paroisH);

        paroisVerticales.add(paroiv1);
        paroisVerticales.add(paroiv2);

        paroisHorizontales.add(paroih1);
        paroisHorizontales.add(paroih2);

        this.balle = new Balle(this, 20,20,20,20);
        ThreadRectangle threadRectangle = new ThreadRectangle(this);
        threadRectangle.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        balle.dessine(g);
        for (Paroi paroi : paroisVerticales){
            paroi.dessine(g);
        }
        for (Paroi paroi : paroisHorizontales){
            paroi.dessine(g);
        }

    }

    public List<Paroi> getParoisVerticales() {
        return paroisVerticales;

    }

    public List<Paroi> getParoisHorizontales() {
        return paroisHorizontales;
    }

    public Balle getBalle() {
        return balle;
    }
}
