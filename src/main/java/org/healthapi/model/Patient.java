package org.healthapi.model;

public class Patient {
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getHypertension() {
        return hypertension;
    }

    public void setHypertension(int hypertension) {
        this.hypertension = hypertension;
    }

    public int getHeart_disease() {
        return heart_disease;
    }

    public void setHeart_disease(int heart_disease) {
        this.heart_disease = heart_disease;
    }

    public String getSmoking_history() {
        return smoking_history;
    }

    public void setSmoking_history(String smoking_history) {
        this.smoking_history = smoking_history;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getHba1c_level() {
        return hba1c_level;
    }

    public void setHba1c_level(double hba1c_level) {
        this.hba1c_level = hba1c_level;
    }

    public int getBlood_glucose_level() {
        return blood_glucose_level;
    }

    public void setBlood_glucose_level(int blood_glucose_level) {
        this.blood_glucose_level = blood_glucose_level;
    }

    public int getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(int diabetes) {
        this.diabetes = diabetes;
    }

    private String gender;
    private String age;
    private int hypertension;
    private int heart_disease;
    private String smoking_history;
    private double bmi;
    private double hba1c_level;
    private int blood_glucose_level;
    private int diabetes;
}