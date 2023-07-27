/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fomdeskapp.toolsapp.utils;

import static com.fomdeskapp.toolsapp.utils.Utils.tempMap;
import java.util.HashMap;

/**
 *
 * @author emerson.guevara
 */
public class Utils {
    
  // MONEDAS CONVER ----------------------------------------------------------------------------------------------------------------------------------------------------    
    
    public static final HashMap<String, Double> currencyMap;
    static {
        currencyMap = new HashMap<>();
        currencyMap.put("USD a Euro", 0.91);
        currencyMap.put("USD a Libreas Esterlinas", 0.76);
        currencyMap.put("USD a Yen Japones", 138.65);
        currencyMap.put("USD a Won", 1265.78);
        currencyMap.put("Euro a USD", 1.10);
        currencyMap.put("Libras Esterlinas a USD", 1.28);
        currencyMap.put("Yen Japones a USD", 0.0071);
        currencyMap.put("Won a USD", 0.00078);

        /*currencyMap.put("FR", 1.24);
        currencyMap.put("LBE", 0.776433);
        currencyMap.put("GT", 7.90);*/
        
    }
     public static final HashMap<String,Boolean> currencyMap2;
    static {
        /*
        US Dollar to CAD Dollar
        US Dollar to Euros
        CAD Dollar to US Dollar
        Euros to US Dollar
        */
        currencyMap2 = new HashMap<>();
        currencyMap2.put("US Dollar to Euros", false);
        currencyMap2.put("USD a Euro", false);
        currencyMap2.put("USD a Libreas Esterlinas", false);
        currencyMap2.put("USD a Yen Japones", false);
        currencyMap2.put("USD a Won", false);
        currencyMap2.put("Euro a USD", false);
        currencyMap2.put("Libras Esterlinas a USD", false);
        currencyMap2.put("Yen Japones a USD", false);
        currencyMap2.put("Won a USD", false);
        
    }
    
    public static String calculateCurrency2(String currency, String amount){
        String result;
        if (currency.isEmpty() || amount.isEmpty()) {
            result = "Both values are requiered";
        } else {
            Double amountCurrency = Double.valueOf(amount.trim());
            Double currencyValue;
            boolean isReverse;
            isReverse = currencyMap2.get(currency);
            if (isReverse) {
                currencyValue = amountCurrency/currencyMap.get(currency);
            } else currencyValue = currencyMap.get(currency)*amountCurrency;
            
            result = String.valueOf(currencyValue);
        }
        return result;
    }
   
  // TEMPERATURA CONVER ----------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final HashMap<String, Double> tempMap;
    static {
        tempMap = new HashMap<>();
        tempMap.put("Celsius a Fahrenheit", 32.0);
        tempMap.put("Fahrenheit a Celsius", 5.0/9.0);
    }
    
    public static final HashMap<String, Boolean> tempMap2;
    static {
        tempMap2 = new HashMap<>();
        tempMap2.put("Celsius a Fahrenheit",true);
        tempMap2.put("Fahrenheit a Celsius",false);
    }
    
    
    public static String calculateTemp2(String temp, String cantidad){
        String result;
        System.out.println("Temp " + temp);
        System.out.println("amount " + cantidad);
        if (temp.isEmpty() || cantidad.isEmpty()) {
            result = "Both values are requiered";
        } else {
            Double amountTemp = Double.valueOf(cantidad.trim());
            Double tempValue;
            boolean isReverse;
            isReverse = tempMap2.get(temp);
            if (isReverse) {
                tempValue = (amountTemp*1.8)+tempMap.get(temp);
            } else tempValue = (amountTemp-32)*tempMap.get(temp);
            //(amountTemp-32)*tempMap.get(temp);
            //(amountTemp*tempMap.get(temp))+ 32;
            
            result = String.valueOf(tempValue);
        }
        return result;
    }
}

//amountTemp/tempMap.get(temp);
//amountTemp-32*tempMap.get(temp);