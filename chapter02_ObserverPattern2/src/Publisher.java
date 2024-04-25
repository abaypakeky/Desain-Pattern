import java.util.HashMap;
interface Publisher{
    Publisher addSubscriber(Subscriber subscriber);
    Publisher removeSubscriber(Class<? extends Subscriber> subsriberClass);
    void produce(Ordering ordering);
}
