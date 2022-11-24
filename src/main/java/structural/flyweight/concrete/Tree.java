package structural.flyweight.concrete;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import structural.flyweight.Plant;
import structural.flyweight.PlantContext;

@Slf4j
@Getter
@RequiredArgsConstructor
public class Tree implements Plant {
    private final String treeType;

    @Override
    public void plant(PlantContext context) {
        log.info("plant a {} tree at {},{}", treeType, context.getX(), context.getY());
    }
}
