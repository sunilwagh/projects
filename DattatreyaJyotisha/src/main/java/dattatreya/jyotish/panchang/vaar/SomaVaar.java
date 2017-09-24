package dattatreya.jyotish.panchang.vaar;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("somavaar")
@Order(value=2)
public class SomaVaar implements Vaar {

}
