public class DogTest {
    public static void main(String[] args) {
        Dog firstDog = new Dog(3,"Dog_1","brown");
        firstDog.burk();
        System.out.println(firstDog.toString());

        Dog secondDog = new Dog(5,"Dog_2","white");
        System.out.println(secondDog.toString());
    }
}
