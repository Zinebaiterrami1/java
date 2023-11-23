package Interface;

import java.util.ArrayList;


public interface Notifier {
    String sendNotification(String message);

    ArrayList<Notifier> liste = new ArrayList<Notifier>();
    /*Notifier ArrayList = new ArrayList();*/
    
     EmailNotifier  email   =  new EmailNotifier();
     SMSNotifier    SMS     =  new SMSNotifier();
     PushNotifier   Push    =  new PushNotifier();

     
    //list.add(email);

    

}
