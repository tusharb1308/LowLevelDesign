package BehaviouralDesignPatterns.Observer;

public class RefundManagementService implements OrderCancelledSubscriber{
    @Override
    public void onOrderCancelledAction() {
        System.out.println("Refund processed after order cancelled");
    }
}
