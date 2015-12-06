/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class Trucks {

    private int ID;
    private ArrayList<Products> products = new ArrayList();

    public Trucks() {
    }

    public Trucks(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "" + this.getID();
    }

}
