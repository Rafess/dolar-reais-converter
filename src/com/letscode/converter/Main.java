package com.letscode.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dolarScanner = new Scanner(System.in);
        System.out.print("Qual a cotação do dolar hoje?");
        float dolarPrice = dolarScanner.nextFloat();
        System.out.print("Qual valor em Reais deseja converter em Dolares?");
        float reaisValue = dolarScanner.nextFloat();
        dolarConverter(dolarPrice, reaisValue);
    }
    public static void dolarConverter(float dolarToday, float reaisValue) {
        float dolarValue = reaisValue / dolarToday;
        System.out.printf("R$ %.2f equivalem a U$ %.2f (cotação: %.2f)", reaisValue, dolarValue, dolarToday);
    }

}
