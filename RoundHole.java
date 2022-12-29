public class RoundHole {
    private int radius;

    RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
