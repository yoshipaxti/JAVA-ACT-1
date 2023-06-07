// Classes for specific animals
class Lion extends Mammal {
    public Lion(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Roar!");
    }

    public void displayInfo() {
        System.out.println("Lion - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
