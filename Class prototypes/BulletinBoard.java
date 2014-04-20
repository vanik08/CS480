import java.util.LinkedList;

/**
 *
 */
public class BulletinBoard {

    /**
     * The list of Taqs that have been placed on this BulletinBoard.
     */
    private LinkedList<Taq> taqs;

    /**
     * The Location of the BulletinBoard on the map.
     */
    private Location locat;

    /**
     * The name of the BulletinBoard to be displayed.
     */
    private String name;


    /**
     * The constructor takes the BulletinBoard's name and location as parameters.
     *
     * @param n name of the BulletinBoard
     * @param l Location object for the BulletinBoard's position
     */
    public BulletinBoard(String n, Location l) {
        name = n;
        locat = l;
        taqs = new LinkedList<Taq>();

        // update database
    }

    /**
     * This method will add a Taq from the list on the BulletinBoard.
     *
     * @param newTaq the new Taq for the BulletinBoard
     */
    public void postTaq(Taq newTaq) {
        taqs.add(newTaq);

        // update BulletinBoard display and database
    }

    /**
     * This method will remove a Taq from the list on the BulletinBoard.
     *
     * @param toRemove the Taq to remove
     */
    public void removeTaq(Taq toRemove) {
        taqs.remove(toRemove);
    }
}
