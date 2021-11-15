import analytics.ReportBuilder;
import database.Authorization;
import database.DataBase;


public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.log(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}

