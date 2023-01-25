package behavioral.command.invoker;

import behavioral.command.TvCommand;
import behavioral.command.concrete.TurnOnCommand;
import behavioral.command.receiver.TV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoteControlTest {

    @Test
    public void remoteControlTest() {
        TV tv = new TV();
        TvCommand turnOnCommand = new TurnOnCommand(tv);
        RemoteControl remote = new RemoteControl(turnOnCommand);
        remote.pressPowerButton();
        assertTrue(tv.isOn());
    }
}