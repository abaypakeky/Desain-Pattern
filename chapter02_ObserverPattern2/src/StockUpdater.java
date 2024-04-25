class StockUpdater implements Subscriber{
    @Override
    public void consume(Ordering ordering){
        System.out.println("stock of product " + ordering.getProduct() + " from order " + ordering.getOrderNo() +
                " has been updated " + ordering.getTotalItem() + " unit");
    }
}

