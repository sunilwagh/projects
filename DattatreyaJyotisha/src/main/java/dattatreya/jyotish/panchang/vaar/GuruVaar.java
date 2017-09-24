package dattatreya.jyotish.panchang.vaar;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruvaar")
@Order(value=5)
public class GuruVaar implements Vaar {

}
