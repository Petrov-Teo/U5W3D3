package io.Petrov_Todor;

import io.Petrov_Todor.entitiesEs1.DataSource;
import io.Petrov_Todor.entitiesEs1.Info;
import io.Petrov_Todor.entitiesEs1.InfoAdapter;
import io.Petrov_Todor.entitiesEs1.UserData;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Info info = new Info("Pino", "Daniele", LocalDate.of(1986, 7, 22));
        DataSource dataSource = new InfoAdapter(info);
        UserData userData = new UserData("", 0);
        userData.getData(dataSource);

    }
}
