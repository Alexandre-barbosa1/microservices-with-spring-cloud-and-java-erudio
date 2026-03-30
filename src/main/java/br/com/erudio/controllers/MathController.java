package br.com.erudio.controllers;

import br.com.erudio.math.SimpleMath;
import br.com.erudio.services.ConvertDoubleService;
import br.com.erudio.services.IsNumericService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!IsNumericService.isNumeric(numberOne) || !IsNumericService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("please set a numeric value");
        return math.sum(ConvertDoubleService.convertToDouble(numberOne), ConvertDoubleService.convertToDouble(numberTwo));
    }

    @RequestMapping("/dim/{numberOne}/{numberTwo}")
    public double dim(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!IsNumericService.isNumeric(numberOne) || !IsNumericService.isNumeric(numberTwo))
            throw new UnsupportedOperationException(("please set a numeric value"));
        return math.subtraction(ConvertDoubleService.convertToDouble(numberOne), ConvertDoubleService.convertToDouble(numberTwo));
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public double mult(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!IsNumericService.isNumeric(numberOne) || !IsNumericService.isNumeric(numberTwo))
            throw new UnsupportedOperationException(("please set a numeric value"));
        return math.multiplication(ConvertDoubleService.convertToDouble(numberOne), ConvertDoubleService.convertToDouble(numberTwo));
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public double div(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!IsNumericService.isNumeric(numberOne) || !IsNumericService.isNumeric(numberTwo))
            throw new UnsupportedOperationException(("please  set a numeric value"));
        return math.division(ConvertDoubleService.convertToDouble(numberOne), ConvertDoubleService.convertToDouble(numberTwo));
    }

    @RequestMapping("/squareRoot/{numberOne}")
    public double squareRoot(
            @PathVariable("numberOne") String numberOne) {
        if (!IsNumericService.isNumeric(numberOne))
            throw new UnsupportedOperationException(("please  set a numeric value"));
        return math.squareRoot(ConvertDoubleService.convertToDouble(numberOne));
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public double mean(
            @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!IsNumericService.isNumeric(numberOne) || !IsNumericService.isNumeric(numberTwo))
            throw new UnsupportedOperationException(("please  set a numeric value"));
        return math.mean(ConvertDoubleService.convertToDouble(numberOne), ConvertDoubleService.convertToDouble(numberTwo));
    }
}