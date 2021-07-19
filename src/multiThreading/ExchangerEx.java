package multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger <Action> exchanger = new Exchanger<>();
        List <Action> friends1Actions = new ArrayList<>();
        friends1Actions.add(Action.SCISSORS);
        friends1Actions.add(Action.PAPER);
        friends1Actions.add(Action.SCISSORS);

        List <Action> friends2Actions = new ArrayList<>();
        friends2Actions.add(Action.PAPER);
        friends2Actions.add(Action.STONE);
        friends2Actions.add(Action.STONE);

        new BestFriend("One", friends1Actions, exchanger);
        new BestFriend("Two", friends2Actions, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER;
}

class BestFriend extends Thread {

    private String name;
    private List <Action> myActions;
    private Exchanger <Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins (Action myAction, Action friendsAction) {
        if ((myAction==Action.STONE&&friendsAction==Action.SCISSORS)
        ||(myAction==Action.SCISSORS&&friendsAction==Action.PAPER)
        ||(myAction==Action.PAPER&&friendsAction==Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply = null;
        for (Action action:myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
