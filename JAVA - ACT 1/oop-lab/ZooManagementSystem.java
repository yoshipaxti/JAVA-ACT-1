// Main class
public class ZooManagementSystem {
    public static void main(String[] args) {
        // Instantiates different animal objects
        Lion lion = new Lion("Leo", 5, "Male");
        Snake snake = new Snake("Slyther", 3, "Female");
        Eagle eagle = new Eagle("Ella", 7, "Female");
        Elephant elephant = new Elephant("Rowel", 20, "Male");
        Lizard lizard = new Lizard("Bandal", 20, "Male");
        Parrot parrot = new Parrot("Dacut", 20, "Male");

        // Call displayInfo() and speak() methods
        lion.displayInfo();
        lion.speak();

        snake.displayInfo();
        snake.speak();

        eagle.displayInfo();
        eagle.speak();

        elephant.displayInfo();
        elephant.speak();

        lizard.displayInfo();
        lizard.speak();

        parrot.displayInfo();
        parrot.speak();
    }
}
