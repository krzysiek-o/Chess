public class Wieza extends Piece {

    private static String type = "BW" ;  //Biała wieża - BW
    private static int count =0;

    public Wieza() {
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
