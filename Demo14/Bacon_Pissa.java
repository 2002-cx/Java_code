package Demo14;

public class Bacon_Pissa extends Pissa{
    public Bacon_Pissa(){};
    private double weight;//克数

    public Bacon_Pissa(double weight) {
        this.weight = weight;
    }

    public Bacon_Pissa(String name, double price, double size, double weight) {
        super(name, price, size);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
