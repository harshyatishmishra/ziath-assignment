package com.ziath.constants;

/**
 * Contain the sample temperatures
 */
public enum SampleTemp {
    BLOOD(5),
    TISSUE(10),
    SALIVA(10);

    int temp;

    SampleTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
