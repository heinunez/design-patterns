package behavioral.state.context;

import behavioral.state.PlayerState;
import behavioral.state.concretes.StoppedState;
import lombok.Getter;


public class Player {

    @Getter
    private PlayerState state = StoppedState.getInstance();

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void changeState(PlayerState state) {
        this.state = state;
    }
}
