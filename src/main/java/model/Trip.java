package model;

import org.bson.types.ObjectId;

public class Trip {
    private ObjectId id;
    private int distance;
    private UberDriver uberDriver;

    public Trip(){
        this.id = new ObjectId();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public UberDriver getUberDriver() {
        return uberDriver;
    }

    public void setUberDriver(UberDriver uberDriver) {
        this.uberDriver = uberDriver;
    }
}
