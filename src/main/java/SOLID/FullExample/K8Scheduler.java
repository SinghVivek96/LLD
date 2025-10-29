package SOLID.FullExample;

import java.time.LocalDateTime;

public class K8Scheduler implements NotifierScheduler{
    @Override
    public void scheduler(String to, String message, LocalDateTime time) {
        //Logic to schedule via K8
    }
}
