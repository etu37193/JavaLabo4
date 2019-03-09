package com.company;

import java.awt.*;

public class Paroi {
    private Rectangle rectangle;

    public Paroi(int hauteur, int largeur, int x, int y){
        this.rectangle = new Rectangle(x,y,largeur,hauteur);
    }

    public void dessine(Graphics g){
        g.fillRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getWidth(),(int) rectangle.getHeight());
    }

    public boolean collision(Balle balle){
        return this.rectangle.intersects(balle.getRectangle());
    }

}
