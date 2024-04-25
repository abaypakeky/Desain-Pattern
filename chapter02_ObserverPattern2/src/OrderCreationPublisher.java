class OrderCreationPublisher implements Publisher{
    private final Map<Class<? extends Subscriber>, Subscriber> subscribers = new HashMap<>();

    @Override
    public Publisher addSubscriber(Subscriber subscriber){
        if (subscriber != null) {
            this.subscribers.put(subscriber.getClass(), subscriber);
        }
        return this;
    }

    @Override
    public Publisher removeSubscriber(Class<? extends Subscriber> subsriberClass){
        if (subsriberClass != null) {
            this.subscribers.remove(subsriberClass);
        }
        return this;
    }

    @Override
    public void produce(Ordering ordering){
        this.subscribers.values().forEach(subscribers -> subscribers.consume(ordering));
    }
}
