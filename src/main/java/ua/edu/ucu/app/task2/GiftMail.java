package ua.edu.ucu.app.task2;

public class GiftMail implements MailCode {
    private static final String TEMPLATE = "%NAME, you've received a gift. Contact us for more information";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
