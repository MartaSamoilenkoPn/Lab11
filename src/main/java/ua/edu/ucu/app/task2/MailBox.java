package ua.edu.ucu.app.task2;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> info;
    private final MailSender sender;

    MailBox(MailSender sender) {
        this.sender = sender;
        info = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        info.add(mailInfo);
    }

    @SneakyThrows
    public void sendAll() {
        for (MailInfo mail : info) {
            sender.sendMail(mail);
        }
        info.clear();
    }
}
