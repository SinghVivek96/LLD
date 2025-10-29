package SOLID.FullExample;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

//✅ SRP – each notifier has one job
//✅ OCP – add new notifier without modifying core code
//✅ LSP – all notifiers behave consistently
//✅ ISP – each notifier implements only what it needs
//✅ DIP – NotificationService depends on interface, not concrete class

@AllArgsConstructor
public class NotificanService {
    private Notifier notifier;

    public void notify(String to, String message){
        notifier.send(to, message);
    }

    public static void main(String args[]){
        new SMSSender().send("vivek", "hello vivek");
        new EmailSender().send("vivek", "hello vivek");

        new K8Scheduler().scheduler("vivek", "hello vivek", LocalDateTime.now());
    }
}
