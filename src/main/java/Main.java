import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(10, 5);
        LinkedList<Washable> toWash = new LinkedList<>();
        toWash.add(new Shirt("blue", 10));
        toWash.add(new Pants("cotton", 20));
        toWash.add(new Pants("jeans", 100, true));
        System.out.println(toWash);
        toWash.forEach(washable -> washingMachine.load(washable));
        // for (Washable washable : toWash) {
        //   washingMachine.load(washable);
        //}
        Set<Washable> washed = washingMachine.wash();
        System.out.println(washed);
        washed.forEach(toberewashed -> {
            if (toberewashed.shouldBeWashed())
                System.out.println("to be rewashed : " + toberewashed);
        });
        //for (Washable x : washed) {
        //  if (x.shouldBeWashed()) {
        //    System.out.println("to be rewashed : " + x);
        //}
        //}

    }
}
