package behavioral.state.context;

import behavioral.state.concretes.PausedState;
import behavioral.state.concretes.PlayingState;
import behavioral.state.concretes.StoppedState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {

    @Test
    public void shouldWorkOnStateChanges() {
        Player player = new Player();

        assertInstanceOf(StoppedState.class, player.getState());
        assertThrows(RuntimeException.class, player::stop);
        assertThrows(RuntimeException.class, player::pause);

        player.play();

        assertInstanceOf(PlayingState.class, player.getState());
        assertThrows(RuntimeException.class, player::play);

        player.pause();

        assertInstanceOf(PausedState.class, player.getState());
        assertThrows(RuntimeException.class, player::pause);

        player.play();
        player.pause();
        player.stop();
        player.play();
        player.stop();

        assertInstanceOf(StoppedState.class, player.getState());
    }
}