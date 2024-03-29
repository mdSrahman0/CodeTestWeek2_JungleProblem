/**Create the objects that you feel would best model a jungle using your best OO design and coding practices based on the following requirements.
        Be ready to submit any and all work, including partial work, at the end of one hour.
        1. The jungle contains several species of animals; tigers, monkeys and snakes.
        2. All animals can do three things, make a sound, eat food, and sleep.
        3. Each species of animal knows how many others of its kind exist.
        4. By default when an animal’s energy level changes, it changes in the following ways:
             a. -3 for making a sound
             b. +5 for eating food
             c. +10 for sleeping
        5. The jungle can perform a sound off. This involves all of the animals in the jungle each making their sound, along with reporting their energy level.
        6. Tigers get +5 energy for sleeping.
        7. Monkeys get +2 energy for eating and -4 energy for making a sound.
        8. Some animals have the ability to play.
        9. Only monkeys can play. When they do they say "Oooo Oooo Oooo" and get -8 energy. If a monkey doesn't have enough energy to play they say "Monkey is too tired".
        10. The jungle contains several types of food; meat, fish, bugs and grain.
        11. Tigers can't eat grain because they have sensitive digestive systems.
        12. Bonus Item: The jungle can have each animal perform a random activity out of the ones possible for that animal. Include Unit tests if you would like to do so.
         
*/

public abstract class Jungle {

    public String meat = "meat";
    public String fish = "fish";
    public String bugs = "bugs";
    public String grain = "grain";

    public int energy = 0;

    public abstract void makeSound();

    public abstract void eat();

    public abstract void sleep();

    public int getEnergy() {
        return this.energy;
    }

    public void soundOff(){
        this.makeSound();
    }
}
