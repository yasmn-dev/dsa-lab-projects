public class Flower {
    private String color;
    private String name;
    private double unitPrice;

    public Flower(String color, String name, double unitPrice) {
        this.color = color;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
