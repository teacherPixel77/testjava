public class Car {
    // Поля класса
    String color; // Цвет автомобиля
    String model; // Модель автомобиля
    int year; // Год выпуска
    int [] numbers = new int[5];
    // Конструктор класса
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }


    // Метод для отображения информации об автомобиле
    public void displayInfo() {
        System.out.println("Модель: " + model + ", Цвет: " + color + ", Год выпуска: " + year);
    }
}