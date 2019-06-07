/**
 * Java. Lesson6. My Homework6.
 *
 * @author Juliya
 * @version dated 7.06.2019
 */
public class Homework6 {
    public static void main(String[] args) {

        Dog dog = new Dog("Шарик", "черный", 5);
        System.out.println(dog);
        dog.run(457);
        dog.jump(0.3);
        dog.swim(9);

        System.out.println();

        Cat cat = new Cat("Барсик", "рыжий", 3);
        System.out.println(cat);
        cat.run(147);
        cat.jump(1.5);
        cat.swim(1);

        System.out.println();

        BigDog bigdog = new BigDog("Мухтар", "коричневый", 5);
        System.out.println(bigdog);
        bigdog.run(600);
        bigdog.jump(1.4);
        bigdog.swim(15);

        System.out.println();

        SmallDog smalldog = new SmallDog("Жучка", "белый", 1);
        System.out.println(smalldog);
        smalldog.run(350);
        smalldog.jump(0.1);
        smalldog.swim(4);
    }
}
