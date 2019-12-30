public class Hetman extends Piece {

    private static String type = "BH"; // Biały Hetman - BH
    private static int count = 0;

    public Hetman() {
        count++;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    String getName() {
        return type;
    }
}


