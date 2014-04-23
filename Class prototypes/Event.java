package taq.uml;
/**
 *
 */
import java.util.Date;
public class Event extends Taq {

    /**
     * The date at which the Event was created.
     */
    private Date startDate;

    // The date at which the Event is set to Expire.
    private Date endDate;


    /**
     * The constructor takes the name, text description, list of tags, home BulletinBoard, and time to end as parameters.
     *
     * @param n the Taq's name
     * @param body the body of the Taq's text
     * @param t the list of tags
     * @param h the BulletinBoard the Taq belongs to
     */
    public Event(String n, String body, Tag[] t, BulletinBoard h, long endTime) {
        super(n, body, t, h);
        // set startDate and endDate
    }

    /**
     * This method will not vary the time, but the visibility of the Event depending on the rank.
     *
     * @param upDown whether it is an up-vote or down-vote; true = up-vote
     */
    public void changeRank(boolean upDown) {
        if (upDown) {
            rank++;
        } else {
            rank--;
        }

        // modify Taq's visibility based on the new rank
    }
}
