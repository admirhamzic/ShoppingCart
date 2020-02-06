public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item milk = new Item("Milk", 20.54);
        Item butter = new Item("Butter", 10.34);
        Item cookie = new Item("Cookies", 10.34);

        cart.addItem(milk);
        cart.addItem(butter);
        cart.addItem(cookie);


        cart.pay(new CreditCardStrategy("Adam", 950645667, 364, 2020));


    }

}