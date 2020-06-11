package main;

import model.Trip;
import model.UberDriver;
import presistance.UberDriverDao;
import presistance.UberDriverMongo;

public class Main {
    public static void main(String[] arg){
        System.out.println("---Uber Dashbord---");
        //System.out.println("Make a Trip: ");
        UberDriver driver = new UberDriver();
        driver.setName("Ali");

        UberDriverDao dao = new UberDriverMongo();
        dao.addDriver(driver);
    }
}
