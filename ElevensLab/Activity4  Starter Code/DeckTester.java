/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        /* *** TO BE COMPLETED IN ACTIVITY 4 *** */

        String[] ran = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        String[] sui = {"spades", "hearts", "diamonds", "clubs"};

        int[] pV = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

        Deck dek = new Deck(ran, sui, pV);
        System.out.println(dek);
        for (int i = 0; i < dek.size(); i++)
        {
            String rank = dek.card(i).rank();
            String suit = dek.card(i).suit();
            int pVs = dek.card(i).pointValue();
            System.out.println(rank);
        }
        dek.shuffle();
        for (int i = 0; i < dek.size(); i++)
        {
            String rank = dek.card(i).rank();
            String suit = dek.card(i).suit();
            int pVs = dek.card(i).pointValue();
            System.out.println(rank);
        }
    }
}
