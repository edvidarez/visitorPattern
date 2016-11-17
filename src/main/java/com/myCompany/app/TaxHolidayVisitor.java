package com.myCompany.app;

/**
 * Created by Edmundo on 13/11/2016.
 */
import java.text.DecimalFormat;

// Concrete Visitor Class

class TaxHolidayVisitor implements Visitor {

    // This formats the item prices to 2 decimal places

    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below

    public TaxHolidayVisitor() {
    }

    // Calculates total price based on this being taxed
    // as a liquor item

    public double visit(Alcohol alcohol) {
      //  System.out.println("Alcohol Item: Price with Tax");
        return Double.parseDouble(df.format((alcohol.getPrice() * 1.10)));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public double visit(Tabaco tabaco) {
     //   System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tabaco.getPrice() * 1.40)));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public double visit(Comida comida) {
     //   System.out.println("Food Item: Price with Tax");
        return Double.parseDouble(df.format(comida.getPrice()));
    }

}
