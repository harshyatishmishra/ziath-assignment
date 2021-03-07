package com.ziath.constants;

/**
 * Contain the sample types
 */
public enum SampleType {
    
    BLOOD("blood"),
    TISSUE("tissue"),
    SALIVA("saliva");

    String sample;

    SampleType(String sample) {
        this.sample = sample;
    }

}
