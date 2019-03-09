package com.company;

public class ThreadRectangle extends Thread {
    private Billard billard;

    public ThreadRectangle(Billard billard) {
        this.billard = billard;
    }

    public void run(){
        while(true){
            try{
                billard.getBalle().bouge();
                billard.repaint();
                Thread.sleep(10);
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
    }
}
