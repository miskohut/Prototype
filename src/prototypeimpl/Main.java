package prototypeimpl;

import prototypeimpl.fruits.Apple;
import prototypeimpl.fruits.FruitFactory;

/**
 * Created by misko on 20.1.2015.
 */
public class Main {

    public static void main(String[] args) {

        FruitFactory factory = new FruitFactory();

        Apple redApple = new Apple("sweet");

        Apple greenApple = (Apple) factory.createFruit(redApple);


        System.out.println(redApple + " " + redApple.getTaste());
        System.out.println(greenApple + " " + greenApple.getTaste());
    }
}
