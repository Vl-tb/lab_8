package facebook;

import lombok.Getter;
import user.User;

import java.util.Date;

@Getter

public class FacebookUser implements User{
    String UserMail;
    String Country;
    Date LastActiveTime;
}
