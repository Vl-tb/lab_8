package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import twitter.TwitterUser;

import java.util.Date;


class MessageSenderTest {
    FacebookUser user1;
    TwitterUser user2;
    MessageSender ms;

    @BeforeEach
    void setUp() {
        ms = new MessageSender();
        user1 = new FacebookUser();
        user2 = new TwitterUser();
        user1.setCountry("Ukraine");
        user2.setCountry("Kazakhstan");
        user1.setLastActiveTime(new Date());
        user2.setLastActiveTime(new Date(1000));
    }

    @Test
    void send() {
        assertEquals(ms.send("hello", user1, "Ukraine"), true);
        assertEquals(ms.send("hello", user2, "Ukraine"), false);
        assertEquals(ms.send("hello", user2, "Kazakhstan"), false);
    }
}