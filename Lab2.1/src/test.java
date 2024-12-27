// ssh -p 2222 s465203@helios.cs.ifmo.ru  rvYS<9974 подключаемся к серверу
// java -jar Laba2.jar
// mkdir build      создание директории
// javac -d build -cp "src:lib/Pokemon.jar" src/Main.java      компиляция


class Car {
    static int count;

    static {
        count = 0;  // Статический блок инициализации
        System.out.println("Класс Car загружен.");
    }

    Car() {
        count++;
    }
}

public class test {
    public static void main(String[] args) {
        System.out.println(Car.count);  // Выводит: 0
        Car car1 = new Car();  // Создание объекта
        Car car2 = new Car();  // Создание еще одного объекта
        System.out.println(Car.count);  // Выводит: 2
    }
}
