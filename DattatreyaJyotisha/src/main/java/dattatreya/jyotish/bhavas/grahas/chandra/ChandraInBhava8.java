package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * http://varahamihira.blogspot.com/2004/06/marana-karaka-avastha-of-planets.html
 *
 */

@Component("chandraInBhava8")
@Order(value=8)
public class ChandraInBhava8 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 8th House: \n");
		sb.append("\n MOON IN EIGHTH (CHANDRASTAMA) \r\n" + 
				"\r\n" + 
				"Chandrastama is considered very inauspicious in any horoscope. As the name suggest this happens when the Moon is placed in 8th house from Lagna. Moon is the overall karaka for the natal horoscope as Sun is the Karaka for the prenatal horoscope. This is because after we have taken birth in this world, we start working under the veil of Maya or illusion or apparent contradictions. \r\n" + 
				"\r\n" + 
				"The body is also nothing but a product of Maya. While we identify ourselves with the body, we forget out true identity as a part of the omnipresent, omniscient and omnipotent Paramatma. The Mind (which is again a product of Maya- Moon) also makes us believe that we are not the soul but the body and gives us our own identity (Ego - feeling of I and You). \r\n" + 
				"\r\n" + 
				"Thus being a significator of Mind and body, if Moon goes to the house of death or one of the houses Moksha Trikona, it gets a terrible shock while it faces the true identity of our soul and that we all would die one day. Such position of Moon ruins the health of the native and the mind is also adversely affected. \r\n" + 
				"Hence, the Moon being the main life giving principle goes to the eighth house of death, she is thoroughly beaten up by the karaka of 8th, the Saturn, the main principle of disease and hard work. \r\n" + 
				"This is again interesting to note that Moon gets debilitated in the 8th house of death of Natural Zodiac, which is opposed to the 2nd house of Sustenance. \n");
		return sb.toString();
	}

}
