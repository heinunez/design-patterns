package behavioral.command.invoker;

import behavioral.command.TvCommand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RemoteControl {
    private final TvCommand turnOnCommand;

    public void pressPowerButton() {
        turnOnCommand.execute();
    }
}
