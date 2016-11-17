package com.myCompany.app;

/**
 * Created by Edmundo on 13/11/2016.
 */
public interface Visitor {
    public double visit(Alcohol liquorItem);

    public double visit(Tabaco tobaccoItem);

    public double visit(Comida necessityItem);
}
