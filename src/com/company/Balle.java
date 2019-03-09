package com.company;

import java.awt.*;

public class Balle {
    private Rectangle rectangle;
    private Billard billard;
    private int deltaX;
    private int deltaY;

    public Balle(Billard billard, int x, int y,int largeur, int hauteur){
        this.billard = billard;
        this.rectangle = new Rectangle(x,y,largeur,hauteur);
        deltaX = 1;
        deltaY = 1;

    }

    public void dessine(Graphics g){
        //g.drawRect((int)rectangle.getX(), (int)rectangle.getY(),(int)rectangle.getWidth(),(int)rectangle.getHeight());
        g.fillOval((int)rectangle.getX(), (int)rectangle.getY(),(int)rectangle.getWidth(),(int)rectangle.getHeight());
    }

    public void bouge(){
        for (Paroi paroi:billard.getParoisVerticales()){
            if (paroi.collision(this)){
                this.deltaX *= -1;
            }
        }

        for (Paroi paroi : billard.getParoisHorizontales()){
            if (paroi.collision(this)){
                this.deltaY *= -1;
            }
        }
        this.rectangle.x += deltaX;
        this.rectangle.y += deltaY;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
