package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization au;
    DataBase db;

    @BeforeEach
    void setUp() {
        au = new Authorization();
        db = new DataBase();
    }

    @Test
    void log() {
        assertEquals(au.log(db), au.авторизуватися(db));
    }
}