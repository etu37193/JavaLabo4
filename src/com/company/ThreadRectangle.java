package com.company;

public class ThreadRectangle extends Thread {
    private Billard billard;

    public ThreadRectangle(Billard billard) {
        this.billard = billard;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(25);
                billard.getBalle().bouge();
                billard.repaint();

            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
    }
}
