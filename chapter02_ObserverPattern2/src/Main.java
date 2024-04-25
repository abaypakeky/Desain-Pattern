public class Main {
    public static void main(String[] args){
        OrderCreationPublisher publisher = new OrderCreationPublisher();
        publisher.addSubscriber(new StockUpdater()).addSubscriber(new InvoiceCreation());
        OrderCreation orderCreation = new OrderCreation(publisher);
        orderCreation.createOrder();
    }
}
