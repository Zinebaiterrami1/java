package Interface;

public class SlackNotifier implements Notifier{
    @Override
    public String sendNotification(String notif)
    {
        System.out.println("notification");
        return notif;
    }
}
