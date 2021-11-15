package facebook;

import lombok.Getter;
import lombok.Setter;
import user.User;

import java.util.Date;

@Getter @Setter

public class FacebookUser implements User{
    String UserMail;
    String Country;
    Date LastActiveTime;
}
