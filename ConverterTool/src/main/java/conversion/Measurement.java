package conversion;

public class Measurement {

    private double inch;
    private double centimeter;
    private double feet;
    private double meter;
    private double mile;
    private double kilometer;
    private double pound;
    private double kilogram;
    private double gallon;
    private double liter;
    private double fahrenheit;
    private double celsius;
    private double ounce;
    private double gram;
    private double squareFeet;
    private double squareMeter;
    private double acre;
    private double hectare;
    private double fluidOunce;
    private double milliliter;

    // Standard to Metric Conversions
    public void inchToCentimeter(double inch) {
        centimeter = Math.round(inch * 2.54);
    }
    public void feetToMeters(double feet) {
        meter = Math.round(feet * 0.3048);
    }
    public void milesToKilometers(double miles) {
        kilometer = Math.round(miles * 1.60934);
    }
    public void poundToKilo(double pound) {
        kilogram = Math.round(pound * 0.453592);
    }
    public void gallonToLiter(double gallon) {
        liter = Math.round(gallon * 3.78541);
    }
    public void fahToCel(double fahrenheit) {
        double answer = (fahrenheit - 32) * 5/9;
        celsius = Math.round(answer * 100.0) / 100.0;
    }
    public void ounceToGram(double ounce) {
        gram = Math.round(ounce * 28.3495);
    }
    public void sqFtToSqM(double squareFeet) {
        squareMeter = Math.round(squareFeet * 0.092903);
    }
    public void acreToHectares(double acre) {
        hectare = Math.round(acre * 0.404686);
    }
    public void fluidOToMilli(double fluidOunce) {
        milliliter = Math.round(fluidOunce * 29.5735);
    }

    // Metric to Standard Conversions
    public void centimeterToInch(double centimeter) {
        inch = Math.round(centimeter * 0.393701);
    }
    public void meterToFeet(double meter) {
        feet = Math.round(meter * 3.28084);
    }
    public void kilometersToMiles(double kilometer) {
        mile = Math.round(kilometer * 0.621371);
    }
    public void kiloToLbs(double kilometer) {
        pound = Math.round(kilogram * 2.20462);
    }
    public void literToGallon(double liter) {
        gallon = Math.round(liter * 0.264172);
    }
    public void celToFah(double celsius) {
        double answer = (celsius * 9/5) + 32;
        fahrenheit = Math.round(answer * 100.0) / 100.0;
    }
    public void gramToOunce(double gram) {
       ounce = Math.round(gram * 0.035274);
    }
    public void sqMToSqFeet(double squareMeter) {
        squareFeet = Math.round(squareMeter * 10.7639);
    }
    public void hectaresToAcres(double hectare) {
       acre = Math.round(hectare * 2.47105);
    }
    public void milliToFluidO(double milliliter) {
        fluidOunce = Math.round(milliliter * 0.033814);
    }

    //Getters
    public double getInch() {
        return inch;
    }
    public double getCentimeter() {
        return centimeter;
    }
    public double getFeet() {
        return feet;
    }
    public double getMeter() {
        return meter;
    }
    public double getMile() {
        return mile;
    }
    public double getKilometer() {
        return kilometer;
    }
    public double getPound() {
        return pound;
    }
    public double getKilogram() {
        return kilogram;
    }
    public double getGallon() {
        return gallon;
    }
    public double getLiter() {
        return liter;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public double getCelsius() {
        return celsius;
    }
    public double getOunce() {
        return ounce;
    }
    public double getGram() {
        return gram;
    }
    public double getSquareFeet() {
        return squareFeet;
    }
    public double getSquareMeter() {
        return squareMeter;
    }
    public double getAcre() {
        return acre;
    }
    public double getHectare() {
        return hectare;
    }
    public double getFluidOunce() {
        return fluidOunce;
    }
    public double getMilliliter() {
        return milliliter;
    }

}
