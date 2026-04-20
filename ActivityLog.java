/**
 * Name: Taphanatu Sesay
 * Date: 04/12/2026
 * Assignment: SDC330L Project Week 1 - Inheritance, Composition, and User Interactions
 * Description: Class used to represent system activity logs for tracking user actions.
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
