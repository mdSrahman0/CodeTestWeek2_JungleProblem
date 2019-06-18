public class Snakes extends Jungle {

    static int numObjects = 0;

    public Snakes() {
        numObjects++;
    }

    @Override
    public void makeSound() {
        System.out.println("HISSSSSS");
        energy -= 3;
    }

    @Override
    public void eat() {
        energy += 5;
    }

    @Override
    public void sleep() {
        energy += 10;
    }

}
