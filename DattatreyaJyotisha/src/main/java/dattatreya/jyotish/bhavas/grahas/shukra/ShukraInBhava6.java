package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava6")
@Order(value=6)
public class ShukraInBhava6 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 6th House: \n");
		sb.append("VENUS IN SIXTH \r\n" + 
				"\r\n" + 
				"Jaimini has given a dictum Shasta Shukra Marana Karaka, which says Venus in the 6th becomes Marana Karaka. Why this is so? \r\n" + 
				"\r\n" + 
				"Sixth is the house of Service and Venus is the karaka of Pleasures, the two opposites. What shall we expect when the chief karaka for pleasure is asked to serve others! In the natural zodiac, 6th is house of debilitation and the sign Virgo symbolizes a virgin (the purest). Hence at this place Venus becomes incapable to enhance its own Karakatva. \r\n" + 
				"\r\n" + 
				"The two karakas for the 6th, Mars (Enemies) and Saturn (Servant). In the Kalachakra this is clear that Mars obstructs the ayana of Venus. Hence none of the Venusian activity shall be performed in the Mars’s Kala. Moreover Saturn signify hard work, which is not suited to pleasures and luxury seeking Venus and hence she goes to the Marana Avastha, if placed in 6th. ");
		return sb.toString();
	}

}
