public class Item {

    private String info;
    private double price;

    public Item(String desc, double cost){
        this.info=desc;
        this.price=cost;
    }
    public String getInfo() {
        return String.format("| %-12s    | %.2f |%n",info,price);

    }

    public double getPrice() {
        return price;
    }

}