package taq.uml;
/**
 *
 */
public abstract class Taq {

    /**
     * This int measures the rating of the Taq. Depending on the implementation, it may either affect the visibility
     * or the time remaining for the Taq.
     */
    protected int rank;

    /**
     * The Taq's name as it is displayed.
     */
    protected String name;

    /**
     * The body of the text for the Taq.
     */
    protected String description;


    /**
     * The list of tags that this Taq is associated with (affects the visibility).
     */
    protected Tag[] tags;

    /**
     * The BulletinBoard that this particular Taq was placed on.
     */
    protected BulletinBoard home;


    /**
     * The constructor takes the name, text description, list of tags, and home BulletinBoard as parameters.
     *
     * @param n the Taq's name
     * @param body the body of the Taq's text
     * @param t the list of tags
     * @param h the BulletinBoard the Taq belongs to
     */
    public Taq(String n, String body, Tag[] t, BulletinBoard h) {
        // initializing fields,
        rank = 0;
        name = n;
        description = body;
        tags = t;
        home = h;
    }

    /**
     * This method will dispense a notification to a User for this Taq, for the User to display.
     *
     * @param receiver the User that will get the TaqNotification
     */
    public void sendNotification(User receiver) {
        // create a TaqNotification and send it to the User
    }

    /**
     * changeRank implementation is handled differently for Notes and Events.
     *
     * @param upDown
     */
    public abstract void changeRank(boolean upDown);

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Tag[] getTags() {
        return tags;
    }

    public BulletinBoard getHome() {
        return home;
    }
}
