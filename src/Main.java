import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Белый", 17, "Мясо", "Рекс", "Лабрадор", 40);
        Bird bird1 = new Bird("синия", 7, "зерна", "Синица", 75);
        ZooPark zooPark = new ZooPark();
        System.out.println(dog1.say());
        System.out.println(dog1.dogRun());
        System.out.println(dog1.dogJump());
        System.out.println(dog1.dogKycb());
        System.out.println(dog1.dogPlay());
        System.out.println(bird1.birdWithAgs());
        System.out.println(bird1.say());
        System.out.println(bird1.birdFight());
        System.out.println(bird1.toSpring());
        System.out.println(dog1.toSpring());
        Dog dog2 = new Dog("Чёрный", 17, "Мясо", "Бульбазавр", "Такса", 13);
        Dog dog3 = new Dog("Серый", 17, "Мясо", "Кусакин", "Питболь", 25);
        Bird bird2 = new Bird("синия", 10, "Насекомые", "Дятел", 115);
        Bird bird3 = new Bird("синия", 15, "Мышей и змей", "Филин", 130);
        zooPark.addAnimalInZoo(bird1);
        zooPark.addAnimalInZoo(bird2);
        zooPark.addAnimalInZoo(bird3);
        zooPark.addAnimalInZoo(dog1);
        zooPark.addAnimalInZoo(dog2);
        zooPark.addAnimalInZoo(dog3);
        Lion lion1 = new Lion("Белый", 30, "Мясо", "Лев", 100);
        System.out.println(lion1.lionPlay());
        System.out.println(lion1.lionRun());
        System.out.println(lion1.say());
        Lion lion2 = new Lion("Красный", 30, "Мясо", "Лев", 100);
        Lion lion3 = new Lion("Рыжий", 30, "Мясо", "Лев", 100);
        System.out.println(lion2.lionPlay());
        System.out.println(lion2.lionRun());
        System.out.println(lion2.say());
        System.out.println(lion3.lionPlay());
        System.out.println(lion3.lionRun());
        System.out.println(lion3.say());
        zooPark.addAnimalInZoo(lion1);
        zooPark.addAnimalInZoo(lion2);
        zooPark.addAnimalInZoo(lion3);
        System.out.println("кол-во Животных в зоопарке :" + zooPark.getInfoZoo(zooPark.zooParks));
        System.out.println("вся информация о животных в зоопарке : ");
        for (Animal s : zooPark.zooParks) {
            if (s != null) {
                System.out.println(s.toSpring());
            }
            System.out.println("----------------------------------");
        }
        zooPark.delete(3);
        for (Animal s : zooPark.zooParks) {
            if (s != null) {
                System.out.println(s.toSpring());
            }


        }

    }
}