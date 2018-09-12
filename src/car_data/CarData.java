package car_data;

public class CarData {
    String Name;
    int Price;

    public CarData() {
        this.Name = "";
        this.Price = 0;
    }

    public CarData(String name, int price) {
        this.Name = name;
        this.Price = price;
    }

    public String GetName() {
        return this.Name;
    }

    public int GetPrice() {
        return this.Price;
    }

    public void PriceUp(int price) {
        this.Price += price;
    }
}
