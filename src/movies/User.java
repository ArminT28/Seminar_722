package movies;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private List<Order> orders;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public User(String firstName, String lastName, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }

    public double calculateTotalPriceForOrder(Order order) {
        return order.calculateTotalPrice();
    }

    public double calculateTotalPriceForAllOrders(){
        double total=0;
        for(Order o:this.orders)
        {
            total += o.calculateTotalPrice();
        }
        return total;
    }

}
