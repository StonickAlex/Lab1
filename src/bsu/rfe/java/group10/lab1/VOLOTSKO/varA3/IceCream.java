package bsu.rfe.java.group10.lab1.VOLOTSKO.varA3;

public class IceCream extends Food {
    private String fill;

    public IceCream(String flavour) {
        super("Жевательная резинка");
        this.fill = flavour;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    public String getFill() {
        return fill;
    }
    public void setFill(String fill) {
        this.fill = fill;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof IceCream)) return false;
            return fill.equals(((IceCream) arg0).fill);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " привкус '" + fill.toUpperCase() + "'";
    }
}
