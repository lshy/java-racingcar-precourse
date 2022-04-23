package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public Cars(String inputName) {
        this.carList = makeCarList(inputName);
    }

    private static List<Car> makeCarList(String inputName){
        List<Car> list = new ArrayList<>();

        String[] names = inputName.split(",");
        for(String name :names){
            list.add(new Car(name));
        }

        return list;
    }
}
