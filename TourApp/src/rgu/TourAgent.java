/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;

/**
 * This class is a that allows the user to create and view Tour Agents.
 * @author Charles Odum (1811200)
 * 17-12-2020
 */
public class TourAgent implements Comparable<TourAgent> { 
    private String name;
    private String location;

    public TourAgent(String name, String location){ 
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Agent " + name + " is based in " + location;
    }

    @Override
    public int compareTo(TourAgent other) {
        return this.name.compareTo(other.getName());
    }
}
 