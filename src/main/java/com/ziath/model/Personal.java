package com.ziath.model;

import com.opencsv.bean.CsvBindByPosition;

import java.util.List;
import java.util.stream.Collectors;

public class Personal extends BaseModel{
    @CsvBindByPosition(position = 0)
    int id;

    @CsvBindByPosition(position = 1)
    String name;

    @CsvBindByPosition(position = 2)
    String surname;

    @CsvBindByPosition(position = 3)
    boolean isOperator;

    @Override
    public String toString() {
        return
                "Person_Id = " + id +
                " Name = '" + name + '\'' +
                " Surname = '" + surname + '\'' +
                " isOperator = " + isOperator ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isOperator() {
        return isOperator;
    }

    public void setOperator(boolean operator) {
        isOperator = operator;
    }

    /**
     * Convert BaseModel into Personal
     * @param baseModels
     * @return
     */
    public static List<Personal> getPersonal(List<BaseModel> baseModels) {
        return baseModels.stream().map(baseModel -> (Personal) baseModel).collect(Collectors.toList());
    }
}
