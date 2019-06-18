public class Tigers extends Jungle {

    static int numObjects = 0;

    public Tigers() {
        numObjects++;
    }

    @Override
    public void makeSound() {
        System.out.println("RWARRRR");
        energy -= 3;
    }

    @Override
    public void eat(){
        energy += 5;
    }

    @Override
    public void sleep() {
        energy += 5;
    }

}
