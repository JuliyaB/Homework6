public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected double obstacle;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getAge() {
        return age;
    }

    protected abstract void run(double obstacle);
    protected abstract void swim(double obstacle);
    protected abstract void jump(double obstacle);
    public abstract String toString();
}
