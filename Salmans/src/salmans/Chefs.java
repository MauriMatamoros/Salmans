/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import javax.swing.JProgressBar;

/**
 *
 * @author mauricio
 */
public class Chefs extends Thread {

    private boolean free = true;
    private Products order;
    private JProgressBar bar;

    public void free() {
        this.free = true;

    }

    @Override
    public void run() {
        bar.setMaximum(order.getTime());
        while (this.free) {
            if (this.free) {
                bar.setValue(bar.getValue() + 1);
                if (bar.getValue() == this.order.getTime()) {
                    this.free = false;
                }
            }
        }

    }

}
