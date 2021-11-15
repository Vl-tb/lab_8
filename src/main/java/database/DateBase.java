package database;

public class DateBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }
    public String  getStatsData(){
        return отриматиСтатистичніДані();
    }
}
