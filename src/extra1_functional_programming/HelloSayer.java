package extra1_functional_programming;

import week1.object.Cat;

@FunctionalInterface
public interface HelloSayer {
    // the only abstract method
    void say();

    default void introduce() {
        System.out.println("asdsad");
    }
}
