package Optional;

import java.util.Optional;

public class Main {
    //of(), Empty(), ofNullable()
    static void main() {
        Optional<String> string = Optional.empty();
        string.isPresent();

    }
}
