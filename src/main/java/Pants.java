public class Pants implements Washable {
    private String material;
    private int cleanliness;
    private boolean ripped;

    public Pants(String material, int cleanliness) {
        this.material = material;
        this.cleanliness = cleanliness;
        this.ripped = false;
    }

    public Pants(String material, int cleanliness, boolean ripped) {
        this.material = material;
        this.cleanliness = cleanliness;
        this.ripped = ripped;
    }

    @Override
    public void onWash() {
        cleanliness += 20;
        if (Math.random() <= 0.5) {
            ripped = true;
        }

    }

    @Override
    public boolean shouldBeWashed() {
        return cleanliness < 90 && !ripped;
    }


    @Override
    public String toString() {
        return "Pants{" +
                "material='" + material + '\'' +
                ", cleanliness=" + cleanliness +
                ", ripped=" + ripped +
                '}';
    }
}
