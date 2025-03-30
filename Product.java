    //Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
//заложенную в программе
public class Product {
    private String name;
    private double price;  

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

