public class Shirt implements Washable {
    private String color;
    private int cleanliness;

    public Shirt(String color, int cleanliness) {
        this.color = color;
        this.cleanliness = cleanliness;
    }


    @Override
    public void onWash() {
        cleanliness += 20;
    }

    @Override
    public boolean shouldBeWashed() {
        return cleanliness < 90;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "color='" + color + '\'' +
                ", cleanliness=" + cleanliness +
                '}';
    }
}
