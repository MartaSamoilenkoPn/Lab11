package ua.edu.ucu.app.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class MailInfo {

    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }

    public String getClientName() {
        return client.getName();
    }

    public String getClientEmail() {
        return client.getEmail();
    }
}
