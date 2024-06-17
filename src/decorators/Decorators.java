/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorators;

import java.awt.Rectangle;
import java.util.Scanner;

/**
 *
 * @author USER
 */

class UnitDecorator extends decorator {
    private final double conversionFactor;

    public UnitDecorator(rectangleinterface  decoratedRectangle, double conversionFactor) {
        super(decoratedRectangle);
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double calculateArea() {
        return super.decoratedRectangle.calculateArea() * conversionFactor;
    }
}

class FormatDecorator extends decorator {
    private final String format;

    public FormatDecorator(rectangleinterface decoratedRectangle, String format) {
        super(decoratedRectangle);
        this.format = format;
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(String.format(format, super.decoratedRectangle.calculateArea()));
    }

    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Decorators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();

        rectangleinterface rectangle = new rectangle(width, height);
        rectangleinterface rectangleInCentimeters = new UnitDecorator(rectangle, 0.393701); 
        rectangleinterface formattedArea = new FormatDecorator(rectangleInCentimeters, "%.2e");

        System.out.println("Area of the rectangle in inches: " + rectangle.calculateArea());
        System.out.println("Area of the rectangle in centimeters squared: " + rectangleInCentimeters.calculateArea());
        System.out.println("Area of the rectangle in scientific notation: " + formattedArea.calculateArea());

        scanner.close();
    }
}