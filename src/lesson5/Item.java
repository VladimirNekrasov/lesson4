package lesson5;

public class Item {

    private int weigth;
    private int price;

    public Item(int weigth, int price) {
        this.weigth = weigth;
        this.price = price;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
