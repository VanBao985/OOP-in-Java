package Relationships;

public class Invoice {
    private  int id;
    private  Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        return amount * customer.getDiscount() / 100;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }
}

