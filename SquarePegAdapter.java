public class SquarePegAdapter extends RoundPeg {
    private static int radius;
    private SquarePeg peg;
    
    SquarePegAdapter(SquarePeg peg) {
        super(radius);
        this.peg = peg;
    }

    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
