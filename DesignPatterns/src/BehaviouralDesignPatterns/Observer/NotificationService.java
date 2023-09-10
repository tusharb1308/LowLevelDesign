package BehaviouralDesignPatterns.Observer;

public class NotificationService implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    @Override
    public void onOrderPlaceAction() {
        System.out.println("Notification sent on order placed");
    }
    @Override
    public void onOrderCancelledAction() {
        System.out.println("Notification sent on order cancelled");
    }
}
