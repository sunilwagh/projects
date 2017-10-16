package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava1")
@Order(value=1)
public final class ShaniInBhava1 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 1st House: \n");
		sb.append("\n Poor Health or Loss of Money SATURN IN LAGNA \r\n" + 
				"\r\n" + 
				"Saturn is the Karaka (Significator) of destruction of intelligence (Dhi) and opposed to Satya, being opposes to Jupiter and Sun respectively. Lagna stands for the intelligence and health of the native and Saturn is opposed to the karakas of the Lagna, Jupiter and Saturn. Whenever Sat goes to the first house, it can’t stand the Karakas and goes into the marana Avastha. \r\n" + 
				"\r\n" + 
				"Now in the natural zodiac too Saturn gets debilitated in the first house Aries, where the fiery Sun gets exalted. Here Sun opposes the lethargy and sluggishness of Saturn and wants it to be fast, jovial and forces it to promote the significations of Sun. Now in mythology, Saturn represent Mahakala, the son of Sun from Chaya. Because of treachery of his mother, Sun can’t stand him and wherever Sun becomes the strong karaka, Saturn becomes weaker.\n");
		return sb.toString();
	}

}
