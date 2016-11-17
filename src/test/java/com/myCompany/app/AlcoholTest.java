package com.myCompany.app;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Edmundo on 13/11/2016.
 */
public class AlcoholTest {
    TaxVisitor taxCalc;
    TaxHolidayVisitor taxHolidayCalc;
    Alcohol whisky;
    double price = 650;
    @Before
    public void setUp()
    {
        taxCalc = new TaxVisitor();
        taxHolidayCalc = new TaxHolidayVisitor();
        whisky = new Alcohol(price);
    }
    @Test
    public void AlcoholTest()
    {
        System.out.println(whisky.accept(taxCalc) );
        assertEquals(price*1.16,whisky.accept(taxCalc),0);
    }
    @Test
    public void AlcoholHolidayTest()
    {
        System.out.println(whisky.accept(taxHolidayCalc) );
        assertEquals(price*1.10,whisky.accept(taxHolidayCalc),0.00001);
    }
}
