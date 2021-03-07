package com.ziath.response;

public class RackResponse {
    int rackId;
    float temp;
    int capacity;

    @Override
    public String toString() {
        return
                "Rack_Id = " + rackId + " Required Temp = " + temp + " Capacity=" + capacity ;
    }

    public RackResponse(int id, float temp, int capacity) {
        this.rackId = id;
        this.temp = temp;
        this.capacity = capacity;
    }

    public int getRackId() {
        return rackId;
    }

    public void setRackId(int rackId) {
        this.rackId = rackId;
    }


    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
