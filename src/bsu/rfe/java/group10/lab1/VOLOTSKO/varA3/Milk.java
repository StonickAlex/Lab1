package bsu.rfe.java.group10.lab1.VOLOTSKO.varA3;

public class Milk extends Food {
    private String fill;

    public Milk(String fat) {
        super("Молоко");
        this.fill = fat;
    }

    public void consume() {
        System.out.println(this + "выпито");
    }

    public String getFill() {
        return fill;
    }
    public void setFill(String fill) {
        this.fill = fill;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Milk)) return false;
            return fill.equals(((Milk) arg0).fill);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " жирность '" + fill.toUpperCase() + "'";
    }
}
