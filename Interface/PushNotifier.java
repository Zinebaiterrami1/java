package Interface;

public class PushNotifier implements Notifier{
    @Override
    public String sendNotification(String PushApp)
    {
        System.out.println("notification of a mobile app");
        return PushApp;
    }
    
}
