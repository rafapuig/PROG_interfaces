package exercises.strategy.observer;

public interface FeedableWithEvent extends Feedable {

    void setOnHungryListener(OnHungryListener listener);

}