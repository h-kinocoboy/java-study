import car_data.CarData;

public class UseCarData {
    public static void main(String[] args) {
        CarData car = new CarData("suzuki", 100);
        System.out.println(car.GetName());
        System.out.println(car.GetPrice());

        car.PriceUp(50);

        System.out.println(car.GetPrice());
    }
}
