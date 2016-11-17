package com.myCompany.app;

/**
 * Created by Edmundo on 13/11/2016.
 */
class Comida implements Visitable {

    private double price;

    Comida(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}