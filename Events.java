package Observer;

public interface Events {
    public void addFollower(Observer observer);

    public void notifyFollowers();
}
