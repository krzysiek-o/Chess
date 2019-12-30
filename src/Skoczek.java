public class Skoczek extends Piece {

    private static String type = "BS";  //Biały skoczek - BS
    private static int count =0;

    public Skoczek() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    String getName() {
        return type;
    }
}
