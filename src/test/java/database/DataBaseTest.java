package database;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    DataBase db;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        db = new DataBase();
    }

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals(db.getUserData(), db.отриматиДаніКористувача());
    }

    @org.junit.jupiter.api.Test
    void getStatsData() {
        assertEquals(db.getStatsData(), db.отриматиСтатистичніДані());
    }
}