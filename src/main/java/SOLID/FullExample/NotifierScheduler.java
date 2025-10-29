package SOLID.FullExample;

import java.time.LocalDateTime;

public interface NotifierScheduler {
    void scheduler(String to, String message, LocalDateTime time);
}
