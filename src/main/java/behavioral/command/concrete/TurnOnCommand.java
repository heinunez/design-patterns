package behavioral.command.concrete;

import behavioral.command.TvCommand;
import behavioral.command.receiver.TV;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TurnOnCommand implements TvCommand {
    private final TV tv;

    @Override
    public void execute() {
        tv.turnOn();
    }
}
