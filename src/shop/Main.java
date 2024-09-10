package shop;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static List<Car> Cars = new ArrayList<>();

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari ", "Голубой", 1, 2_000_000);
        Car car2 = new Car("Porshe ", "Розовый ", 3, 2_500_000);
        Car car3 = new Car("Lamborgini ", "Красный ", 1, 2_600_000);
        Car car4 = new Car("Aston Martin ", "Серебристый ", 2, 1_800_000);
        Car car5 = new Car("Maserati ", "Черный ", 2, 2_200_000);
        Car car6 = new Car("Bentley ", "Белый ", 4, 3_000_000);
        Car car7 = new Car("Rolls-Royce ", "Синий ", 4, 4_000_000);
        Car car8 = new Car("McLaren ", "Оранжевый ", 2, 2_800_000);
        Car car9 = new Car("Bugatti ", "Красный ", 2, 10_000_000);
        Car car10 = new Car("Pagani ", "Серый ", 2, 5_000_000);

        Cars.add(car1);
        Cars.add(car2);
        Cars.add(car3);
        Cars.add(car4);
        Cars.add(car5);
        Cars.add(car6);
        Cars.add(car7);
        Cars.add(car8);
        Cars.add(car9);
        Cars.add(car10);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите, что вы хотите сделать:");
            System.out.println("1. Посмотреть доступные автомобили;");
            System.out.println("2. Оформить заказ;");
            System.out.println("3. Принять заказ");
            System.out.println("4. Выйти из программы.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < Cars.size(); i++) {

                        System.out.print(Cars.get(i).getModel() + " ");
                        System.out.print(Cars.get(i).getColor() + " ");
                        System.out.print(Cars.get(i).getQuantity() + " ");
                        System.out.println(Cars.get(i).getPrice() + " ");
                    }
                    break;
                case 2:
                    System.out.println("Введите номер автомобиля, который вы хотите заказать:");
                    int carNumber = scanner.nextInt();
                    if (carNumber >= 1 && carNumber <= 10) {
                        System.out.println("Вы заказали " + Cars.get(carNumber - 1));
                    } else {
                        System.out.println("Неверный номер автомобиля.");
                    }
                    break;
                case 3:
                    System.out.println("Введите номер автомобиля, который вы хотите принять:");
                    carNumber = scanner.nextInt();
                    if (carNumber >= 1 && carNumber <= 10) {
                        System.out.println("Вы приняли заказ на " + Cars.get(carNumber - 1));
                    } else {
                        System.out.println("Неверный номер автомобиля.");
                    }
                    break;
                case 4:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }
}