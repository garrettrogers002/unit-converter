package org.garrettrogers002.unitconverter;

import java.util.List;

public interface conversion {
    private double value;
    private String fromUnit;
    private String toUnit;

    public conversion(double value, String fromUnit, String toUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }
    void convert() {
        // conversion logic here
    }
}
public class lengthConversion implements conversion {
    public lengthConversion(double value, String fromUnit, String toUnit) {
        super(value, fromUnit, toUnit);
    }
    @Override
    double convert() {
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
                            double result = value * 3.28084;
                            return result;
                        }
                        case "inches" -> {
                            double result = value * 39.3700787;
                            return result;
                        }
                        case "centimeters" -> {
                            double result = value * 100;
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
    }
}