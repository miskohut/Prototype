package prototypeimpl.fruits;

/**
 * Created by misko on 20.1.2015.
 */
public abstract class Fruit implements Fruits {

    protected String taste;

    public Fruit(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public Fruits makeCopy() {
        Fruit fruit  = null;

        try {
            fruit = (Fruit)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return fruit;
    }
}
