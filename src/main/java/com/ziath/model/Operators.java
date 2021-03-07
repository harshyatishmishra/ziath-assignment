package com.ziath.model;

import com.opencsv.bean.CsvBindByPosition;

import java.util.List;
import java.util.stream.Collectors;

public class Operators extends BaseModel {

    @CsvBindByPosition(position = 0)
    int subjectId;

    @CsvBindByPosition(position = 1)
    int operatorId;

    /**
     * Convert BaseModel into Operators
     * @param baseModels
     * @return
     */
    public static List<Operators> getOperators(List<BaseModel> baseModels) {
        return baseModels.stream().map(baseModel -> (Operators) baseModel).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Operators { " +
                "subjectId = " + subjectId +
                ", operatorId = " + operatorId +
                " } ";
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public Operators(int subjectId, int operatorId) {
        this.subjectId = subjectId;
        this.operatorId = operatorId;
    }

    public Operators() {
    }
}
