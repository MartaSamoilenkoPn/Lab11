import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import  ua.edu.ucu.app.task1.User;

public class BuilderTest {
    @Test
    public void testNazar() {
        User ivan = User.builder().name("Nazar").age(20).weight(80).height(185).build();
        Assertions.assertEquals(ivan.getName(), "Nazar");
        Assertions.assertEquals(ivan.getAge(), 20);
        Assertions.assertEquals(ivan.getWeight(), 80);
        Assertions.assertEquals(ivan.getHeight(), 185);
    }

    @Test
    public void testDefault() {
        User defaultUser = User.builder().build();
        Assertions.assertNull(defaultUser.getName());
        Assertions.assertEquals(defaultUser.getAge(), 0);
        Assertions.assertEquals(defaultUser.getWeight(), 0);
        Assertions.assertEquals(defaultUser.getHeight(), 0);
    }
}