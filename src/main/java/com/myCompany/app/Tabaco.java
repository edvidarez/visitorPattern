package com.myCompany.app;

/**
 * Created by Edmundo on 13/11/2016.
 */
class Tabaco implements Visitable {

    private double price;

    Tabaco(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}