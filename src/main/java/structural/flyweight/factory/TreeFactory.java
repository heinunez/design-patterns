package structural.flyweight.factory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import structural.flyweight.concrete.Tree;

import java.util.HashMap;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TreeFactory {
    private static TreeFactory instance;
    private final HashMap<String, Tree> trees = new HashMap<>();

    public static TreeFactory getInstance() {
        if (instance == null)
            instance = new TreeFactory();
        return instance;
    }

    public Tree getTree(String treeType) {
        Tree tree;
        if (trees.containsKey(treeType)) {
            tree = trees.get(treeType);
        } else {
            log.info("creating {} tree", treeType);
            tree = new Tree(treeType);
            trees.put(treeType, tree);
        }
        return tree;
    }
}
