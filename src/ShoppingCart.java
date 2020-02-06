import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {

    //List of items
    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        System.out.format("+-------------------------+%n");
        System.out.format("|       JAVA MARKET       |%n");
        System.out.format("+-----------------+-------+%n");
        System.out.format("|     Product     | Price |%n");
        System.out.format("+-----------------+-------+%n");
        double amount = calculateTotal();
        for (Item item: items) {
            System.out.format(item.getInfo());
        }
        paymentMethod.pay(amount);
    }
}