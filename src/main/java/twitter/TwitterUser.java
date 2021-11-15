package twitter;

import lombok.Getter;
import user.User;

import java.util.Date;

@Getter

public class TwitterUser implements User {
        String UserMail;
        String Country;
        Date LastActiveTime;
    }

