package behavioral.chain;

public class Bugtracker {
    public static void main(String[] args) {
        Notifier simpleReportNotifier = new SimpleReportNotifier(Priority.RUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        simpleReportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleReportNotifier.notifyManager("Everything is OK.", 1);
        simpleReportNotifier.notifyManager("Something went wrong!", 2);
        simpleReportNotifier.notifyManager("Houston, we've had a problem here!!!", 3);
    }
}
