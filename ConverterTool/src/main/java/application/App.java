package application;

import conversion.Measurement;
import menu.Menu;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    Measurement m = new Measurement();
    Menu menu = new Menu();


    public static void main(String[] args){
            App mainApp = new App();
            mainApp.run();
    }

    public void run() {

        menu.startMenu();
        System.out.println(" ");
        System.out.println(" ");
        standardOrMetric();
        System.out.println(" ");
        standardToMetric();
        System.out.println(" ");
        metricToStandard();


    }


        private void standardOrMetric() {
            System.out.println("Please select your conversion type: Standard-to-Metric (M) or Metric-to-Standard (S): ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("m")) {
                standardToMetric();
            }
            if (userInput.equalsIgnoreCase("s")) {
                metricToStandard();
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

    public void standardToMetric() {

        while (true) {

            menu.mainSTMMenu();

            Scanner scanner = new Scanner(System.in);
            int menuInput = scanner.nextInt();
            double doubleInput;

            if (menuInput == 1) {
                System.out.println("Enter your inches: ");
                doubleInput = scanner.nextDouble();
                m.inchToCentimeter(doubleInput);
                System.out.println(doubleInput + " inches is " + m.getCentimeter() + " centimeters.");
                mainMenuOrExit();
            } else if (menuInput == 2) {
                System.out.println("Enter your feet: ");
                doubleInput = scanner.nextDouble();
                m.feetToMeters(doubleInput);
                System.out.println(doubleInput + " feet is " + m.getMeter() + " meters.");
                mainMenuOrExit();
            } else if (menuInput == 3) {
                System.out.println("Enter your miles: ");
                doubleInput = scanner.nextDouble();
                m.milesToKilometers(doubleInput);
                System.out.println(doubleInput + " miles is " + m.getKilometer() + " kilometers.");
                mainMenuOrExit();
            } else if (menuInput == 4) {
                System.out.println("Enter your pounds: ");
                doubleInput = scanner.nextDouble();
                m.poundToKilo(doubleInput);
                System.out.println(doubleInput + " pounds is " + m.getKilogram() + " kilograms.");
                mainMenuOrExit();
            } else if (menuInput == 5) {
                System.out.println("Enter your gallons: ");
                doubleInput = scanner.nextDouble();
                m.gallonToLiter(doubleInput);
                System.out.println(doubleInput + " gallons is " + m.getLiter() + " liters.");
                mainMenuOrExit();
            } else if (menuInput == 6) {
                System.out.println("Enter your Fahrenheit Temperature (exclude the 'F'): ");
                doubleInput = scanner.nextDouble();
                m.fahToCel(doubleInput);
                System.out.println(doubleInput + "F is " + m.getCelsius() + " Celsius.");
                mainMenuOrExit();
            } else if (menuInput == 7) {
                System.out.println("Enter your ounces: ");
                doubleInput = scanner.nextDouble();
                m.ounceToGram(doubleInput);
                System.out.println(doubleInput + " ounces is " + m.getGram() + " grams.");
                mainMenuOrExit();
            } else if (menuInput == 8) {
                System.out.println("Enter your square footage: ");
                doubleInput = scanner.nextDouble();
                m.sqFtToSqM(doubleInput);
                System.out.println(doubleInput + " sq ft is " + m.getSquareMeter() + " sq meters.");
                mainMenuOrExit();
            } else if (menuInput == 9) {
                System.out.println("Enter your acreage: ");
                doubleInput = scanner.nextDouble();
                m.acreToHectares(doubleInput);
                System.out.println(doubleInput + " acres is " + m.getHectare() + " hectares.");
                mainMenuOrExit();
            } else if (menuInput == 10) {
                System.out.println("Enter your fluid ounces: ");
                doubleInput = scanner.nextDouble();
                m.fluidOToMilli(doubleInput);
                System.out.println(doubleInput + " fluid ounces is " + m.getMilliliter() + " milliliters.");
                mainMenuOrExit();
            } else if (menuInput == 11) {
                System.out.println("Thank you for using the ConversionTool. Have a nice day. Goodbye.");
                System.exit(0);
            } else {
                System.out.println("That is an invalid choice. Please try again.");
            }
        }
    }

    public void metricToStandard() {

        while (true) {

            menu.mainMTSMenu();

            Scanner scanner = new Scanner(System.in);
            int menuInput = scanner.nextInt();
            double doubleInput;

            if (menuInput == 1) {
                System.out.println("Enter your centimeters: ");
                doubleInput = scanner.nextDouble();
                m.centimeterToInch(doubleInput);
                System.out.println(doubleInput + " centimeters is " + m.getInch() + " inches.");
                mainMenuOrExit();
            } else if (menuInput == 2) {
                System.out.println("Enter your meters: ");
                doubleInput = scanner.nextDouble();
                m.meterToFeet(doubleInput);
                System.out.println(doubleInput + " meters is " + m.getFeet() + " feet.");
                mainMenuOrExit();
            } else if (menuInput == 3) {
                System.out.println("Enter your kilometers: ");
                doubleInput = scanner.nextDouble();
                m.kilometersToMiles(doubleInput);
                System.out.println(doubleInput + " kilometers is " + m.getMile() + " miles.");
                mainMenuOrExit();
            } else if (menuInput == 4) {
                System.out.println("Enter your kilograms: ");
                doubleInput = scanner.nextDouble();
                m.kiloToLbs(doubleInput);
                System.out.println(doubleInput + " kilograms is " + m.getPound() + " pounds.");
                mainMenuOrExit();
            } else if (menuInput == 5) {
                System.out.println("Enter your liters: ");
                doubleInput = scanner.nextDouble();
                m.literToGallon(doubleInput);
                System.out.println(doubleInput + " liters is " + m.getGallon() + " gallons.");
                mainMenuOrExit();
            } else if (menuInput == 6) {
                System.out.println("Enter your Celsius Temperature (exclude the 'C'): ");
                doubleInput = scanner.nextDouble();
                m.celToFah(doubleInput);
                System.out.println(doubleInput + "C is " + m.getFahrenheit() + " Fahrenheit.");
                mainMenuOrExit();
            } else if (menuInput == 7) {
                System.out.println("Enter your grams: ");
                doubleInput = scanner.nextDouble();
                m.gramToOunce(doubleInput);
                System.out.println(doubleInput + " grams is " + m.getOunce() + " ounces.");
                mainMenuOrExit();
            } else if (menuInput == 8) {
                System.out.println("Enter your square meters: ");
                doubleInput = scanner.nextDouble();
                m.sqMToSqFeet(doubleInput);
                System.out.println(doubleInput + " sq meters is " + m.getSquareFeet() + " sq ft.");
                mainMenuOrExit();
            } else if (menuInput == 9) {
                System.out.println("Enter your hectares: ");
                doubleInput = scanner.nextDouble();
                m.hectaresToAcres(doubleInput);
                System.out.println(doubleInput + " hectares is " + m.getAcre() + " acres.");
                mainMenuOrExit();
            } else if (menuInput == 10) {
                System.out.println("Enter your milliliters: ");
                doubleInput = scanner.nextDouble();
                m.milliToFluidO(doubleInput);
                System.out.println(doubleInput + " milliliters is " + m.getFluidOunce() + " fluid ounces.");
                mainMenuOrExit();
            } else if (menuInput == 11) {
                System.out.println("Thank you for using the ConversionTool. Have a nice day. Goodbye.");
                System.exit(0);
            } else {
                System.out.println("That is an invalid choice. Please try again.");
            }
        }
    }
        private void mainMenuOrExit() {
            System.out.println("Would you like to return to the main menu? (Y) or (N) to exit the program.");
            String mmOrExit = scanner.nextLine();
            if (mmOrExit.equalsIgnoreCase("y")) {
                run();
            } else if (mmOrExit.equalsIgnoreCase("n")) {
                System.out.println("Thank you for using the ConversionTool. Have a nice day. Goodbye.");
                System.exit(0);
            } else {
                System.out.println("Invalid. (Y) or (N): ");
            }
        }
}
