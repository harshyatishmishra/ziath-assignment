package com.ziath.model;

import com.opencsv.bean.CsvBindByPosition;

import java.util.List;
import java.util.stream.Collectors;

public class Racks extends BaseModel {

    @CsvBindByPosition(position = 0)
    int racksId;

    @CsvBindByPosition(position = 1)
    int numRows;

    @CsvBindByPosition(position = 2)
    int numCols;

    /**
     * Convert BaseModel into Racks
     * @param baseModels
     * @return
     */
    public static List<Racks> getRacks(List<BaseModel> baseModels) {
        return baseModels.stream().map(baseModel -> (Racks) baseModel).collect(Collectors.toList());
    }

    public int getRacksId() {
        return racksId;
    }

    public void setRacksId(int racksId) {
        this.racksId = racksId;
    }

    @Override
    public String toString() {
        return "Racks { " +
                "racksId = " + racksId +
                ", numRows = " + numRows +
                ", numCols = " + numCols +
                '}';
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }
}
