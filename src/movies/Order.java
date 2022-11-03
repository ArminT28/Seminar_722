package movies;

import java.util.List;
import java.util.Date;

public class Order {
    private Date orderDate;
    private List<OrderLine> orderLines;

    public Order(Date orderDate, List<OrderLine> orderLine) {
        this.orderDate = orderDate;
        this.orderLines = orderLine;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice(){
        double total=0;
        for (OrderLine o: this.orderLines)
        {
            total += o.calculatePrice();
        }
        return total;
    }
}
