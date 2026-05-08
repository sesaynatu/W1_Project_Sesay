/**
 * Name: Taphanatu Sesay
 * Date: May 8, 2026
 * Assignment: SDC330 5.2 Project - Application Delivery
 * Description: Final application delivery for the SecureTrack Security System.
 */

// Interface implementation: ActivityLog implements Trackable to define tracking behavior
public class ActivityLog implements Trackable {

    private String action;
    private String time;

    public ActivityLog(String action, String time) {
        this.action = action;
        this.time = time;
    }

    public void displayLog() {
        System.out.println("Action: " + action + ", Time: " + time);
    }

    @Override
    public void track() {
        System.out.println("Tracking activity: " + action);
    }
}
