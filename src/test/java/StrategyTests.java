import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.app.task2.*;

public class StrategyTests {

    private final Client client = new Client("Marta", 19, Gender.MALE, "Marta's mail");;

    @Test
    public void clientTest() {
        Client second = new Client("Valeria", 20, Gender.FEMALE, "Valeria's mail");
        Assertions.assertEquals(client.getName(), "Marta");
        Assertions.assertEquals(client.getAge(), 19);
        Assertions.assertEquals(client.getSex(), Gender.FEMALE);
        Assertions.assertEquals(client.getEmail(), "Marta's mail");

        Assertions.assertEquals(second.getName(), "Valeria");
        Assertions.assertEquals(second.getAge(), 20);
        Assertions.assertEquals(second.getSex(), Gender.FEMALE);
        Assertions.assertEquals(second.getEmail(), "Valeria's mail");
    }

    @Test
    public void giftTest() {
        GiftMail giftMail = new GiftMail();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generate(client),
                "Marta, you have received a gift. Contact us for more information");
    }

    @Test
    public void MailInfo() {
        GiftMail giftMail = new GiftMail();
        MailInfo mInfo = new MailInfo(client, giftMail);
        Assertions.assertEquals(giftMail.generate(client), mInfo.generate());
        Assertions.assertEquals(mInfo.getClientEmail(), "Marta's mail");
        Assertions.assertEquals(mInfo.getClientName(), "Marta");
    }
}
