/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;

/**
 * The purpose of this class is to encapsulate the common properties associated with different types of tour packages.
 * @author Charles Odum (1811200)
 * 12-12-2020
 */
public abstract class TourPackage {
    private String description;
    private String location;
    private double tourCost;

    public TourPackage(String description, String location, double tourCost) {
        this.description = description;
        this.location = location;
        this.tourCost = tourCost;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public double getTourCost() {
        return tourCost;
    }
    public void UpdateTourCost(double amount) {
        if(amount > this.tourCost){
            this.tourCost = amount;
        }
    }

    @Override
    public String toString() {
        return "TourPackage{" + "description=" + description + ", location=" + location + ", tourCost=" + tourCost + '}';
    }
    
     public abstract double getCost();
     
}
