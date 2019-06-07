public class SmallDog extends Dog {

    public SmallDog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(double obstacle) {
        if (obstacle >= 0.1 && obstacle <= 400) {
            System.out.println(getName() + " бежит " + obstacle + " м");
        } else {
            System.out.println("Ваша собака не может столько пробежать");
        }
    }

    @Override
    public void swim(double obstacle) {
        if (obstacle >= 0.1 && obstacle <= 5) {
            System.out.println(getName() + " плывет " + obstacle + " м");
        } else {
            System.out.println("Ваша собака не может столько проплыть");
        }
    }

    @Override
    public void jump(double obstacle) {
        if (obstacle >= 0.1 && obstacle <= 0.2) {
            System.out.println(getName() + " прыгает " + obstacle + " м в высоту");
        } else {
            System.out.println("Ваша собака не может столько прыгнуть");
        }
    }

    @Override
    public String toString() {
        return "Собака по имени " + getName() + ", " + "имеет цвет шерсти " + getColor() + ", " + "возраст: " + getAge();
    }
}
