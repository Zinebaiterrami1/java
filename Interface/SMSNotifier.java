package Interface;

public class SMSNotifier implements Notifier{
   
    @Override
    public String sendNotification(String SMS)
    {
        System.out.println("notification of sms");
        return SMS;
    }
}
