package Demo14;

public class Fruit_Pissa extends Pissa{
    public Fruit_Pissa(){}
    private String burdening;

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    public Fruit_Pissa(String burdening) {
        this.burdening = burdening;
    }

    public Fruit_Pissa(String name, double price, double size, String burdening) {
        super(name, price, size);
        this.burdening = burdening;
    }
}
