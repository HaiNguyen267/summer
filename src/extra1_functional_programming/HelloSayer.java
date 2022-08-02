package extra1_functional_programming;

@FunctionalInterface
public interface HelloSayer {
    // the only abstract method
    void say();

    default void introduce() {
        System.out.println("asdsad");
    }
}
