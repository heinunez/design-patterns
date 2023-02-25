package behavioral.strategy.context;

import behavioral.strategy.RobotBehaviour;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Robot {
    private final RobotBehaviour behaviour;

    public String talk() {
        return behaviour.talk();
    }
}
