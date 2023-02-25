package behavioral.strategy.concrete;

import behavioral.strategy.RobotBehaviour;

public class AggressiveBehaviour implements RobotBehaviour {
    @Override
    public String talk() {
        return "🤬";
    }
}
