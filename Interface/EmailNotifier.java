package Interface;

public class EmailNotifier implements Notifier{
   
    @Override
    public String sendNotification(String email)
    {
        System.out.println("notification of an email");
        return email;
    }
}
