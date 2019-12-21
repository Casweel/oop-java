package com.company;

public class Korgi extends Dog {
    private boolean tailDocked;

    public Korgi() {
    }

    public Korgi(String color, String gender, int weight, boolean tailDocked) {
        super(color, gender, weight);
        this.tailDocked = tailDocked;
    }

    @Override
    public String toString() {
        return "Korgi{" +
                super.toString() + ", " +
                "tailDocked=" + tailDocked + "} ";
    }

    public boolean isTailDocked() {
        return tailDocked;
    }

    public void setTailDocked(boolean tailDocked) {
        this.tailDocked = tailDocked;
    }
}
