package prototypeimpl.fruits;

/**
 * Created by misko on 20.1.2015.
 */
public class FruitFactory {

    public Fruits createFruit(Fruits fruit) {
        return fruit.makeCopy();
    }
}
