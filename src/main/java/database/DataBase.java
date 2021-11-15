package database;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }
    public String  getStatsData(){
        return отриматиСтатистичніДані();
    }
}
