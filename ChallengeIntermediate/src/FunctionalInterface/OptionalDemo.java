package FunctionalInterface;

import java.util.Optional;

public class OptionalDemo { // Changed the class name since Optional is a reserved keyword
    public static void main(String[] args) {
        System.out.println(toOptional(null)); // This line is correct but be careful of potential null pointer exceptions
        System.out.println(toOptional(""));
        System.out.println(toOptional("jaspdojii"));
    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
