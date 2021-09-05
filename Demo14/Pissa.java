package Demo14;

public class Pissa {
    //编写程序实现披萨制作、需求说明编写程序，接收用户输入的信息，选择需要制作的披萨
    //可供选择的披萨：水果披萨、培根披萨
    public Pissa(){};
    private String name;//名称
    private double price;//价格
    private double size;//大小

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBig() {
        return size;
    }

    public void setBig(double size) {
        this.size = size;
    }

    public Pissa(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String  Show(){
      return "披萨名称:"+name+"\t"+"披萨尺寸:"+size+"\t披萨价格："+price;
    }
}
