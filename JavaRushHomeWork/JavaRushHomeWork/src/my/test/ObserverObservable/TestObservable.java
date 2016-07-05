package my.test.ObserverObservable;

/**
 * Created by vdzhevalov on 6/2/2016.
 */
public class TestObservable extends java.util.Observable {
    private String name = "";
    public TestObservable(String name) {
        this.name = name;
    }

    public void modify() {
        setChanged();
    }

    public String getName() {
        return name;
    }
}
