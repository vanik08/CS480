package taq.uml;

import java.sql.Time;

/**
 *
 */
public class Note extends Taq {

    /**
     * The time remaining before the Note expires (and potentially the BulletinBoard).
     */
    private Time timeRemaining;


    /**
     * The constructor takes the name, text description, list of tags, and home BulletinBoard as parameters.
     *
     * @param n the Taq's name
     * @param body the body of the Taq's text
     * @param t the list of tags
     * @param h the BulletinBoard the Taq belongs to
     */
    public Note(String n, String body, Tag[] t, BulletinBoard h) {
        super(n, body, t, h);

        // set initial time remaining
    }

    /**
     * This method will vary the time remaining for the Note depending on the new rank.
     *
     * @param upDown whether it is an up-vote or down-vote; true = up-vote
     */
    public void changeRank(boolean upDown) {
        if (upDown) {
            this.rank++;
        } else {
            this.rank--;
        }

        // modify the time remaining for this Note depending on the change in rank
    }
}
