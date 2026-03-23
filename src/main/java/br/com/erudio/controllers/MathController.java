package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    @RequestMapping("/dim/{numberOne}/{numberTwo}")
    public double dim(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException(("please set a numeric value"));
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public double multi(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
            if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException(("please set a numeric value"));
            return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public double div(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException(("please  set a numeric value"));
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        String number = str.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty())throw new UnsupportedOperationException("please set a numeric value");
        String number = str.replaceAll(",", ".");
        return Double.parseDouble(number);
    }
}
