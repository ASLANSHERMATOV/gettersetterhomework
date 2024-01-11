public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(5);
        cat.setColor("Blue");
        System.out.println(cat.getName());
        System.out.println(cat.getAge() + " years");
        System.out.println(cat.getColor());

        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setBreed("Treska");
        fish.setWeight(2);
        System.out.println(fish.getName()+" "+ fish.getBreed()+" "+ fish.getWeight());

        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        parrot.setAge(4);
        parrot.setColor("green");
        System.out.println(parrot.getName()+" "+ parrot.getAge()+" "+ parrot.getColor());
    }
}