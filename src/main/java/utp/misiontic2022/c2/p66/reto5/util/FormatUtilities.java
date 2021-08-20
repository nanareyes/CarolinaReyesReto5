/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p66.reto5.util;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author nana
 */
public class FormatUtilities {
    
    public static String formatCurrency(String number){
        Float amount = Float.parseFloat(number);
        Locale colombia = new Locale("es", "CO");
        // Create a Currency instance for the Locale
        Currency pesos = Currency.getInstance(colombia);
        // Create a formatter given the Locale
        NumberFormat pesosFormat = NumberFormat.getCurrencyInstance(colombia);
        
        return pesosFormat.format(amount);
    }
}
