package behavioral.strategy.concrete;

import behavioral.strategy.RobotBehaviour;

public class NormalBehaviour implements RobotBehaviour {
    @Override
    public String talk() {
        return "😐";
    }
}
