package org.garrettrogers002.unitconverter;

import java.util.List;

public class Length_converter implements conversion {
    private final double value;
    private  final String fromUnit;
    private final String toUnit;

    public Length_converter(double value, String fromUnit, String toUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }
    @Override 
    public double convert() {
        double result = (double) 0;
        // length conversion logic here
        List<String> lengthUnits = List.of("meters", "feet", "inches", "centimeters");
        if (!lengthUnits.contains(fromUnit) || !lengthUnits.contains(toUnit)) {
            throw new IllegalArgumentException("Invalid length units");
        } else if (fromUnit.equals(toUnit)) {
            System.out.println("no conv needed");
        } else {
            switch (fromUnit) {
                case "meters" -> {
                    switch (toUnit) {
                        case "feet" -> {
                            result = value * 3.28084;
                            return result;
                        }
                        case "inches" -> {
                            result = value * 39.3700787;
                            return result;
                        }
                        case "centimeters" -> {
                            result = value * 100;
                            return result;
                        }
                    }

                }
                case "feet" -> {

                }
                case "inches" -> {

                }
                case "centimeters" -> {

                }
            }
        }
        return result;
    }
}



