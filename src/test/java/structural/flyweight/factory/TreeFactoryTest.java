package structural.flyweight.factory;

import lombok.val;
import org.junit.jupiter.api.Test;
import structural.flyweight.PlantContext;

class TreeFactoryTest {

    @Test
    public void treeTest() {
        val context1 = new PlantContext(1, 2);
        val context2 = new PlantContext(1, 1);
        //...
        val context400 = new PlantContext(1, 400);

        val tree1 = TreeFactory.getInstance().getTree("oak");
        val tree2 = TreeFactory.getInstance().getTree("oak");
        val tree400 = TreeFactory.getInstance().getTree("pine");

        tree1.plant(context1);
        tree2.plant(context2);
        tree400.plant(context400);
    }

}