package com.ziath.model;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import com.ziath.constants.SampleType;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Samples extends BaseModel {

    @CsvBindByPosition(position = 0)
    int sampleId;

    @CsvBindByPosition(position = 1)
    SampleType sampleType;

    @CsvBindByPosition(position = 2)
    float volume;

    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 3)
    LocalDate date;

    @CsvBindByPosition(position = 4)
    int subjectId;

    @CsvBindByPosition(position = 5)
    int rackId;

    @CsvBindByPosition(position = 6)
    int row;

    @CsvBindByPosition(position = 7)
    int column;

    @CsvBindByPosition(position = 8)
    String bloodType;

    @CsvBindByPosition(position = 9)
    String tissueOrigin;

    @Override
    public String toString() {
        return
                "Sample_Id = " + sampleId +
                " Sample_Type = " + sampleType +
                " Volume = " + volume +
                " Date = " + date ;
    }

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getRackId() {
        return rackId;
    }

    public void setRackId(int rackId) {
        this.rackId = rackId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTissueOrigin() {
        return tissueOrigin;
    }

    public void setTissueOrigin(String tissueOrigin) {
        this.tissueOrigin = tissueOrigin;
    }

    /**
     * Convert BaseModel into Samples
     * @param baseModels
     * @return
     */
    public static List<Samples> getSamples(List<BaseModel> baseModels) {
        return baseModels.stream().map(baseModel -> (Samples) baseModel).collect(Collectors.toList());
    }
}
