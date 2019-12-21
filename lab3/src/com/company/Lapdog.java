package com.company;

public class Lapdog extends Dog {
    private String subspecies;

    public Lapdog() {
    }

    public Lapdog(String color, String gender, int weight, String subspecies) {
        super(color, gender, weight);
        this.subspecies = subspecies;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                super.toString() + ", " +
                "subcpecies=" +  '\'' +subspecies + '\'' +"} ";

    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }
}
