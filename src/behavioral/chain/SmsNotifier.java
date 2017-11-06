package behavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Sending sms: " + message);
    }
}
