package behavioral.state.concretes;

import behavioral.state.PlayerState;
import behavioral.state.context.Player;

public class StoppedState implements PlayerState {

    private static StoppedState instance;

    public static StoppedState getInstance() {
        if (instance == null)
            instance = new StoppedState();
        return instance;
    }

    @Override
    public void play(Player player) {
        player.changeState(PlayingState.getInstance());
    }

    @Override
    public void pause(Player player) {
        throw new RuntimeException("player stopped");
    }

    @Override
    public void stop(Player player) {
        throw new RuntimeException("already stopped");
    }
}
