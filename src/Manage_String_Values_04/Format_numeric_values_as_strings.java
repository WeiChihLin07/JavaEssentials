package Manage_String_Values_04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Format_numeric_values_as_strings {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        // Format numeric values as strings
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormatter.format(doubleValue));

        var localeTW = new Locale("ch", "TW");
        var localeTWFormatter = NumberFormat.getNumberInstance(localeTW);
        System.out.println("Number: " + localeTWFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance(localeTW);
        System.out.println(currencyFormatter.format(doubleValue));

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));
    }
}
