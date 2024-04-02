package entity;

public class Games {
    private long id;
    private String gameName;
    private double price;

    private double discount;

    private double priceAfterDiscount;

    public Games(){

    }

    public Games(long id, String gameName, double price) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceAfterDiscount() {
        return this.price-this.price*(discount/100);
    }
}
