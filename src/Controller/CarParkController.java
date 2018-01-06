package Controller;

import Models.CarPark;
import Models.CarParkService;
import Models.DatabaseConnection;

import java.util.ArrayList;

public class CarParkController {
    public static DatabaseConnection database;

    public static void selectedCarPark(){
        int carParkTestId = 3;

        ArrayList<CarPark> carParkTest = new ArrayList<>();
        CarParkService.selectById(carParkTestId, database);
        for (CarPark c: carParkTest) {
            System.out.println(c);
        }
    }
}
