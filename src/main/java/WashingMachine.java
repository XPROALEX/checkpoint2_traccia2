import java.util.HashSet;
import java.util.Set;

public class WashingMachine {
    private int water;
    private int capacity;
    private Set<Washable> loadedObjects;

    public WashingMachine(int water, int capacity) {
        this.water = water;
        this.capacity = capacity;
        this.loadedObjects = new HashSet<>();
    }

    public void load(Washable washable) {
        loadedObjects.add(washable);
    }

    public Set<Washable> wash() {
        loadedObjects.forEach(Washable::onWash);
        Set<Washable> cleanItems = new HashSet<>();
        cleanItems.addAll(loadedObjects);
        loadedObjects.clear();
        return cleanItems;
    }
}
