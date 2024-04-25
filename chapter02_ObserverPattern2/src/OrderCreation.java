import java.math.BigDecimal;

class OrderCreation{
    private final Publisher publisher;

    OrderCreation(Publisher publisher){
        this.publisher = publisher;
    }

    public void createOrder(){
        Ordering ordering = new Ordering();
        ordering.setCustomer("tukul");
        ordering.setSeller("arwana");
        ordering.setOrderNo("xyz-888");
        ordering.setPrice(BigDecimal.TEN);
        ordering.setProduct("susu");
        ordering.setTotalItem(10);
        System.out.println("successfully created order " + ordering.getOrderNo());
        this.publisher.produce(ordering);
    }
}
