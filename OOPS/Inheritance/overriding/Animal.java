class Animal {
    public void sound() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class BabyCat extends Cat {
    @Override
    public void sound() {
        super.sound();
        System.out.println("baby meow");
    }
}

public class AnimalDriver {
    public static void main(String[] args) {
        BabyCat c = new BabyCat();
        c.sound();

        Cat d = new Cat();
        d.sound();
    }
}
