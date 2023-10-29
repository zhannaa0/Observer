package Observer;

import java.util.List;

public class Follower implements Observer {
    String name;
    String surname;

    public Follower(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void handle(List<String> promotions) {
        System.out.println("Dear " + name + " " + surname + "!"
                + "\n We have special promotions for this month!"
                + "\n" + promotions);
    }
}
