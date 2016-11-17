package com.myCompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Edmundo on 13/11/2016.
 */
public class FoodTest {
    TaxVisitor taxCalc;
    TaxHolidayVisitor taxHolidayCalc;
    Comida Birria;
    double price = 50;
    @Before
    public void setUp()
    {
        taxCalc = new TaxVisitor();
        taxHolidayCalc = new TaxHolidayVisitor();
        Birria = new Comida(price);
    }
    @Test
    public void FoodTest()
    {
        System.out.println(Birria.accept(taxCalc) );
        assertEquals(price,Birria.accept(taxCalc),0);
    }
    @Test
    public void FoodHolidayTest()
    {
        System.out.println(Birria.accept(taxHolidayCalc) );
        assertEquals(price,Birria.accept(taxHolidayCalc),0);
    }
}

