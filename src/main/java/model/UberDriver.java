package model;

import org.bson.types.ObjectId;

public class UberDriver {
    private ObjectId id;
    private String name;
    private Boolean isTrip;
    private int mony;

    public UberDriver() {
        this.id = new ObjectId();
        this.mony = 0;
        this.isTrip = false;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTrip() {
        return isTrip;
    }

    public void setTrip(Boolean trip) {
        isTrip = trip;
    }

    public int getMony() {
        return mony;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }
}
