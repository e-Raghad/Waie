package com.example.raghad.lastchamcebaby;

public class Alhaj {
    private String name,hotSun;
    private int age;
    private boolean doctor;

    public Alhaj(String name, String hotSun, int age, boolean doctor) {
        this.name = name;
        this.hotSun = hotSun;
        this.age = age;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotSun() {
        return hotSun;
    }

    public void setHotSun(String hotSun) {
        this.hotSun = hotSun;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }
}
