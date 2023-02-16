package behavioral.state.concretes;

import behavioral.state.PlayerState;
import behavioral.state.context.Player;

public class PausedState implements PlayerState {

    private static PausedState instance;

    public static PausedState getInstance() {
        if (instance == null)
            instance = new PausedState();
        return instance;
    }

    @Override
    public void play(Player player) {
        player.changeState(PlayingState.getInstance());
    }

    @Override
    public void pause(Player player) {
        throw new RuntimeException("already paused");
    }

    @Override
    public void stop(Player player) {
        player.changeState(StoppedState.getInstance());
    }
}
