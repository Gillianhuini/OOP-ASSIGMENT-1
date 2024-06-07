/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package car1;

/**
 *
 * @author ANNEGILLIAN
 */


import java.util.Scanner;

public class CAR1 {
    private static final Scanner carsystem = new Scanner(System.in);
    private String numberPlate;
    private String brand;
    private String make;

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public void setNumberPlate(String newNumberPlate) {
        this.numberPlate = newNumberPlate;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void gatherVehicleDetails() { // Renamed from compute
        System.out.printf("Enter the number plate: ");
        setNumberPlate(carsystem.nextLine());
        System.out.printf("Enter the car brand: ");
        setBrand(carsystem.nextLine());
        System.out.printf("Enter the car make: ");
        setMake(carsystem.nextLine());
    }
}

class CUSTOMER extends CAR1 {
    Scanner carsystem1 = new Scanner(System.in);
    long idNumber;
    String firstName;
    String lastName;
    long phoneNumber;

    public void collectCustomerData() { 
        gatherVehicleDetails(); 

        System.out.printf("Enter the id number: ");
        idNumber = carsystem1.nextInt();
        System.out.printf("Enter the First name: ");
        firstName = carsystem1.nextLine();
        carsystem1.nextLine();
        System.out.printf("Enter the last name: ");
        lastName = carsystem1.nextLine();
        System.out.printf("Enter the phone number");
        phoneNumber = carsystem1.nextInt();
    }
}

class RENTALAGENCY extends CUSTOMER {
    Scanner agencie = new Scanner(System.in);
    int hours;
    int price = 1000;

    public void calculateRentalCost() { // Renamed from calculate
        collectCustomerData(); // Reuse inherited method

        System.out.printf("Enter the hours:");
        hours = agencie.nextInt();
        System.out.println("The total price is KES " + (hours * price));
        System.out.println("The number plate is: " + getNumberPlate());
        System.out.println("The car brand is: " + getBrand());
        System.out.println("The car make is: " + getMake());
        System.out.println("The id number of customer is: " + idNumber);
        System.out.println("The first name of customer is: " + firstName);
        System.out.println("The last name of customer is: " + lastName);
        System.out.println("The phone number of customer is: " + phoneNumber);
    }

    public static void main(String[] args) {
        RENTALAGENCY star = new RENTALAGENCY();
        star.calculateRentalCost();
    }
}


   
