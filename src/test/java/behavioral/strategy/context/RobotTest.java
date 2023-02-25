package behavioral.strategy.context;

import behavioral.strategy.concrete.AggressiveBehaviour;
import behavioral.strategy.concrete.FriendlyBehaviour;
import behavioral.strategy.concrete.NormalBehaviour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotTest {

    @Test
    public void shouldTalkCorrectlyDependingOnTheStrategy() {
        Robot normalRobot = new Robot(new NormalBehaviour());
        assertEquals("😐", normalRobot.talk());

        Robot aggressiveRobot = new Robot(new AggressiveBehaviour());
        assertEquals("🤬", aggressiveRobot.talk());

        Robot friendlyRobot = new Robot(new FriendlyBehaviour());
        assertEquals("😙", friendlyRobot.talk());
    }

}