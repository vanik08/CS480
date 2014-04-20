import java.util.ArrayList;

/**
 *
 */
public class User {

    /**
     * The list of top (3? 5?) tags the user wants to see the most of.
     */
    private Tag[] favoriteTags;

    /**
     * The user's set of settings encapsulated in a Settings object.
     */
    private Settings userSettings;

    /**
     * The unique ID for identifying this User on the database.
     */
    private int id;

    /**
     * The list of Integer ID's for each friend on the User's list (used for certain Friends-only settings).
     */
    private ArrayList<Integer> friends;

    /**
     * The User's Location on the map.
     */
    private Location locat;

    /**
     * The list of BulletinBoards that are near to (and therefore visible at) the User's location.
     */
    private BulletinBoard[] nearbyBB;


    /**
     * The constructor simply takes the User's unique integer ID to initialize the object.
     *
     * @param id the User's unique ID, as an integer
     */
    public User(int id) {
        this.id = id;

        // favoriteTags = new String[topTagsSize...];

        // initialize Settings and location...
        friends = new ArrayList<Integer>();
    }

   // update method for nearby BulletinBoards to be placed here

    /**
     * This method simply adds a friend to the User's personalized list, using their integer ID.
     *
     * @param id the ID used to identify the friend
     */
    public void addFriend(int id) {
        friends.add(new Integer(id));
    }

    /**
     * This method simply removes a friend from the User's personalized list, using their integer ID.
     *
     * @param id the ID used to identify the friend
     */
    public void removeFriend(int id) {
        friends.remove(new Integer(id));
    }

    /**
     * The new list of top Tags for the User.
     *
     * @param topTags the new list of Tags
     */
    public void updateTags(Tag[] topTags) {
        favoriteTags = topTags;
    }
}
