import analytics.ReportBuilder;
import database.Authorization;
import database.DateBase;


public class Main {
    public static void main(String[] args) {
        DateBase db = new DateBase();
        Authorization authorization = new Authorization();
        if (authorization.log(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}

