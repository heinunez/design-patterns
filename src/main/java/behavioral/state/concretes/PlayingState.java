package behavioral.state.concretes;

import behavioral.state.PlayerState;
import behavioral.state.context.Player;

public class PlayingState implements PlayerState {
    private static PlayingState instance;

    public static PlayingState getInstance() {
        if (instance == null)
            instance = new PlayingState();
        return instance;
    }

    @Override
    public void play(Player player) {
        throw new RuntimeException("already playing");
    }

    @Override
    public void pause(Player player) {
        player.changeState(PausedState.getInstance());
    }

    @Override
    public void stop(Player player) {
        player.changeState(StoppedState.getInstance());
    }
}
