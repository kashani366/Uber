package main;

import model.Trip;

import java.util.Scanner;

public class TripMaker {
    private Trip trip;
    public Scanner sc = new Scanner(System.in);

    public TripMaker(){
        trip = new Trip();
    }

    public void tripCategory(){
        System.out.println("Enter Distance:");
        int distance = sc.nextInt();
        this.trip.setDistance(distance);
    }

    private void driverSelector(){

    }
}
