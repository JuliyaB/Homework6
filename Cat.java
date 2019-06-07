public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(double obstacle) {
        if (obstacle >= 0.1 && obstacle <= 200) {
            System.out.println(getName() + " бежит " + obstacle + " м");
        } else {
            System.out.println("Ваш кот не может столько пробежать");
        }
    }

    @Override
    public void swim(double obstacle) {
        System.out.println("Коты не умеют плавать!");
    }

    @Override
    public void jump(double obstacle) {
        if (obstacle >= 0.1 && obstacle <= 2) {
            System.out.println(getName() + " прыгает " + obstacle + " м в высоту");
        } else {
            System.out.println("Ваш кот не может столько прыгнуть");
        }
    }

    @Override
    public String toString() {
        return "Кот по имени " + getName() + ", " + "имеет цвет шерсти " + getColor() + ", " + "возраст: " + getAge();
    }
}
