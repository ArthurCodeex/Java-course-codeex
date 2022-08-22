import java.util.Optional;

public class HelloOtus {
    public static void main(String[] args) {
        new HelloOtus();
    }
    public HelloOtus() {
        Optional<Integer> value = Optional.of(10);
        System.out.println(value.get());
    }
}
