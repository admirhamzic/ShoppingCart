class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private int cardNumber;
    private int cvv;
    private int dateOfExpiry;

    public CreditCardStrategy(String nm, int ccNum, int cvv, int expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(double amount) {
        System.out.format("+-----------------+-------+%n");
        System.out.format("|      TOTAL      | "+amount+" |%n");
        System.out.format("+-----------------+-------+%n");
    }

}