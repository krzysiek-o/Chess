import java.util.Arrays;
import java.util.Random;

public class Chess {

    public static void main(String[] args) {
        Random random = new Random();
        Piece[][] pieces = new Piece[8][8];

        //Tablica dwuwymiarowa wspólrzędnych pol (bez powtórzeń)
        int[][] tab = new int[5][2];

        for (int i = 0; i < 5; i++) {

            int x = random.nextInt(8);
            int y = random.nextInt(8);

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (tab[j][0] == x) {
                    if (tab[j][1] == y) {
                        i--;
                        isDuplicate = true;
                        break;
                    }
                }
            }
            if (isDuplicate) {
                continue;
            }
            tab[i][0] = x;
            tab[i][1] = y;
        }
        //------------------------------------------------------------------

        int[] tX = new int[5]; //tablica z współrzędnymi punktów X
        int[] tY = new int[5]; //tablica z współrzędnymi punktów Y

        //Tablica x-ow
        for (int i = 0; i < 5; i++) {
            tX[i] = tab[i][0];
        }
        //Tablica y-ków
        for (int i = 0; i < 5; i++) {
            tY[i] = tab[i][1];
        }
        //------------------------------------------------------------------

        //wypełnianie planszy pionkami z założeniami
        for (int i = 0; i < 5; i++) {

            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    Hetman hetman = new Hetman();
                    if (hetman.getCount() < 2) {
                        pieces[tX[i]][tY[i]] = hetman;
                    } else {
                        i--;
                    }
                    break;
                case 1:
                    Skoczek skoczek = new Skoczek();
                    if (skoczek.getCount() < 3) {
                        pieces[tX[i]][tY[i]] = skoczek;
                    } else {
                        i--;
                    }
                    break;
                case 2:
                    Wieza wieza = new Wieza();
                    if (wieza.getCount() < 3) {
                        pieces[tX[i]][tY[i]] = wieza;
                    } else {
                        i--;
                    }

            }
        }

        //------------------------------------------------------------------

        //wyświetlanie planszy
        System.out.println("Plansza gry: ");
        for (int i = 0; i < pieces.length; i++) {
            for (int k = 0; k < pieces.length; k++) {
                if (pieces[i][k] != null) {
                    System.out.print(pieces[i][k].getName() + " ");
                } else {
                    System.out.print("[] ");

                }
            }
            System.out.println(" ");
        }
    }
}

