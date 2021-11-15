package sender;

import user.User;

public class MessageSender {
    boolean send(String text, User user, String country){
        long millis=System.currentTimeMillis() - 3600000;
        java.util.Date date=new java.util.Date(millis);
        if (user.getCountry() == country && user.getLastActiveTime().after(date) ){
            return true;
        }
        return false;
    }
}
