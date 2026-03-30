package br.com.erudio.services;

public class IsNumericService {
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        String number = str.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
