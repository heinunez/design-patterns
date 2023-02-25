package behavioral.strategy.concrete;

import behavioral.strategy.RobotBehaviour;

public class FriendlyBehaviour implements RobotBehaviour {
    @Override
    public String talk() {
        return "😙";
    }
}
