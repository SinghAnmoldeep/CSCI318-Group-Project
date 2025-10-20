package com.example.analytics.web;
import org.springframework.web.bind.annotation.*; import java.util.Map;
import static com.example.analytics.stream.Consumers.COUNTS;
@RestController @RequestMapping("/api/analytics")
public class AnalyticsController {
  @GetMapping("/status-counts") public Map<String, Long> counts(){ return COUNTS; }
}
