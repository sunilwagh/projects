package dattatreya.jyotish.service.horoscope;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {
 @RequestMapping("/api/hello")
 public String greet() {
  return "Hello from the other side!!!";
 }
}