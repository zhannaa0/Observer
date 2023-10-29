package Observer;

import java.util.ArrayList;
import java.util.List;

public class CafeNotificator implements Events {

    List<String> promotions = new ArrayList<>();

    List<Observer> followers = new ArrayList<>();

    public void publishEvent(String promotion){
        this.promotions.add(promotion);
        notifyFollowers();
    }

    @Override
    public void addFollower(Observer follower) {
        this.followers.add(follower);
    }

    @Override
    public void notifyFollowers() {
        for(Observer observer: followers){
            observer.handle(this.promotions);
        }
    }
}
