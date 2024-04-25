class InvoiceCreation implements Subscriber{
    @Override
    public void consume(Ordering ordering){
        System.out.println("invoice from order " + ordering.getOrderNo() + " has been created");
    }
}
