package CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

    public static void main(String[] args) {
        arrayListExamples();
    }

    public static void arrayListExamples() {
        ArrayList<Car> cars = new ArrayList();


        Car car1 = new Car("Camaro 68`");
        Car car2 = new Car("Camaro 69`");
        Car car3 = new Car("Camaro 72`");
        Car car4 = new Car("Chevelle 69`");
        Car car5 = new Car("Chevelle 70`");
        Car car6 = new Car("Chevelle 72`");

        cars.add(car5);
        cars.add(car2);
        cars.add(car6);
        cars.add(car1);
        cars.add(car4);
        cars.add(car3);

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }


    }
}
