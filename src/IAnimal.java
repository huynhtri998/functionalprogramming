@FunctionalInterface
public interface IAnimal {
    void run();

    default void printAnimal() {
        System.out.println("Animal is running");
    }

    static void printAnimal2() {
        System.out.println("Animal is running");
    }
}
