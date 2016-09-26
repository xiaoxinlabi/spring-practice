package info.puton.practice.springpractice.beans;

/**
 * Created by Pauline on 16/9/26.
 */
public class Cake {

    private String name;

    private String type;

    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cake(String name, String type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Cake() {
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
