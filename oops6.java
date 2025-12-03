
import java.util.Scanner;

// Vehicle Management System
// Description:
// Create a small system to manage vehicles and track how many are electric vs. fuel-based.
// Requirements:
// Class Vehicle
// Private variables: registrationNumber, type (e.g., “Electric” or “Fuel”), mileage
// Static variables: totalVehicles, electricCount, fuelCount
// Constructors:
// Default → type = "Unknown"
// Parameterized → sets type and mileage
// Method displayInfo()
// When an object is created, automatically update counters using this and condition check
// Static method showStats() → prints total counts
// Expected Output:
// Total Vehicles: 3
// Electric Vehicles: 2
// Fuel Vehicles: 1
// Details:
// EV123 - Electric - Mileage: 120.0
// FX456 - Fuel - Mileage: 50.0
// EV789 - Electric - Mileage: 140.0


class Item{
    private String name;
    private int quality;
    private double price;

    Item(){
        this.name="unknowm";
        this.quality=0;
        this.price=0.0;
    }

    Item(String name, int quality, double price){
        this.name=name;
        this.quality=quality;
        this.price=price;
    }

    Item(Item it){
        this.name=it.name;
        this.quality=it.quality;
        this.price=it.price;    
    }
    public double getTotalValue(){
        return quality*price;
    }

    public void display(){
        System.out.println("Item: " + name + " | Quantity: " + quality + " | Price: " + price + " | Value: " + getTotalValue());
    }
}

class oops6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of entries");
        int n=sc.nextInt();
        Item[] items=new Item[n];

        for(int i=0; i<n; i++){
            String name=sc.next();
            int quality=sc.nextInt();
            double price=sc.nextDouble();

            items[i]=new Item(name, quality, price);
        }
        for (int i =0; i < n; i++) {
            items[i].display();
        }
            
        }
    }


