package com.sda.vat;

import java.math.BigDecimal;
import java.util.LinkedList;

import static oracle.jrockit.jfr.events.Bits.floatValue;

public class Main {

    static final BigDecimal vat = BigDecimal.valueOf(1.23);

    public static void main(String[] args) {
	// write your code here
        LinkedList<BigDecimal> kwoty = new LinkedList<>();
        LinkedList<BigDecimal> kwotyVat = new LinkedList<>();
        long count = 1L;
        BigDecimal kwota = BigDecimal.valueOf(count);


        while (true) {

            kwoty.add(kwota);
            kwotyVat.add(kwota.multiply(vat));

            System.out.println("Kwota: " + kwoty + " kwota vat: " + kwotyVat);
            count += 10;
        }
    }
}
