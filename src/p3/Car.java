package p3;

public class Car {
    String color;
    private int doorCount;
    Engine engine;
    int get (){
        return this.engine.a;
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine (Engine engine){
        this.engine=engine;
    }

    public class Engine {
        private int a=5+doorCount;
        int horsePower;
        Engine (int horsePower){
            this.horsePower=horsePower;
        }

        @Override
        public String toString() {
            return " My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return " My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        Car car1 = new Car("red", 5);
        Car.Engine engine1 = car1.new Engine(200);
        car1.setEngine(engine1);
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car.get());
        System.out.println(car1.get());

    }
}
