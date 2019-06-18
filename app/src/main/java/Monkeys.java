public class Monkeys extends Jungle {

    static int numObjects = 0;

    public Monkeys(){
        numObjects++;
    }

    @Override
    public void makeSound() {
        System.out.println("OOO OOO AHH");
        energy -= 4;
    }

    @Override
    public void eat() {
        energy += 2;
    }

    @Override
    public void sleep() {
        energy += 10;
    }

    public void play(){
        if(energy >= 8) {
            System.out.println("Oooo Ooo Ooo");
            energy -= 8;
        } else {
            System.out.println("Monkey too tired to play");
        }
    }
}
