import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    Main mn;
    String[] args;
    @BeforeEach
    void setUp() {
        mn = new Main();
        args = new String[10];
    }

    @Test
    void main() {
        mn.main(args);
    }
}