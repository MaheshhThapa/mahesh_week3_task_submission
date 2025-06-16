class Animal {
    void makeSound() {
        System.out.println("Animal sounds...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moooooooo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Cow();

        animal[0].makeSound();
        animal[1].makeSound();
        animal[2].makeSound();
    }
}
