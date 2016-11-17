package com.myCompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Edmundo on 13/11/2016.
 */
public class TabacoTest {
    TaxVisitor taxCalc;
    TaxHolidayVisitor taxHolidayCalc;
    Tabaco maria;
    double price = 212;  //gr
    @Before
    public void setUp()
    {
        taxCalc = new TaxVisitor();
        taxHolidayCalc = new TaxHolidayVisitor();
        maria = new Tabaco(price);
    }
    @Test
    public void TabacoTest()
    {
        System.out.println(maria.accept(taxCalc) );
        assertEquals(price*1.30,maria.accept(taxCalc),0);
    }
    @Test
    public void TabacoHolidayTest()
    {
        System.out.println(maria.accept(taxHolidayCalc) );
        assertEquals(price*1.40,maria.accept(taxHolidayCalc),0.0001);
    }
}

