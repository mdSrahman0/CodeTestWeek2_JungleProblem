// The driver class to test everything

public class TestJungle {

    public static void main(String[] args) {

        System.out.println("All animals start at 0 energy.");
        System.out.println("Testing Tigers...");
        TestTiger();

        System.out.println();
        System.out.println("Testing Monkeys...");
        TestMonkeys();

        System.out.println();
        System.out.println("Testing snakes...");
        TestSnakes();
    }

    public static void TestTiger(){
        Tigers bengal = new Tigers();
        Tigers siberian = new Tigers();

        System.out.println("Number of tigers = "+ bengal.numObjects); // print out all tiger objects

        bengal.makeSound(); // Bengal tiger make a sound
        System.out.println("Bengal tiger energy = " + bengal.getEnergy());  // Print Bengal Tiger's energy level
        siberian.eat();
        System.out.println("Siberian tiger energy = " + siberian.getEnergy());
    }

    public static void TestMonkeys() {
        Monkeys jim = new Monkeys();
        jim.sleep();
        System.out.println("Jim's current energy = " + jim.getEnergy());
        jim.play();
        System.out.println("Jim's snergy after playing = " + jim.getEnergy());
    }

    public static void TestSnakes() {
        Snakes voldermort = new Snakes();
        voldermort.eat();
        voldermort.sleep();
        voldermort.makeSound();
        System.out.println("Voldermort's energy = " + voldermort.getEnergy());
    }
}
