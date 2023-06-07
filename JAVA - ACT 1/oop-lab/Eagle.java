class Eagle extends Bird {
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Screech!");
    }

    public void displayInfo() {
        System.out.println("Eagle - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}