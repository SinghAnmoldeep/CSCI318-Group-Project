package com.example.analytics.stream;
import com.example.analytics.events.AppointmentStatusChangedEvent;
import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
import java.util.concurrent.ConcurrentHashMap; import java.util.function.Consumer;
@Configuration
public class Consumers {
  public static final ConcurrentHashMap<String, Long> COUNTS = new ConcurrentHashMap<>();
  @Bean
  public Consumer<AppointmentStatusChangedEvent> appointmentStatusChanged(){
    return evt -> COUNTS.merge(evt.newStatus(), 1L, Long::sum);
  }
}
