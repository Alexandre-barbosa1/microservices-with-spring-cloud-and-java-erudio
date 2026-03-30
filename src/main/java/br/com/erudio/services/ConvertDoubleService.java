package br.com.erudio.services;

public class ConvertDoubleService {

    public static Double convertToDouble(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) throw new UnsupportedOperationException("please set a numeric value");
        String number = str.replaceAll(",", ".");
        return Double.parseDouble(number);
    }
}
