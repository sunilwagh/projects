package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava12")
@Order(value=12)
public final class SuryaInBhava12 implements SuryaInBhava{

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 12th House: \n");
		sb.append("SUN IN TWELFTH \r\n" + 
				"\r\n" + 
				"Besides other significations, 12th house signify pleasures of Bed, signified by Venus. Sun is the protector of Dharma and hence another significator of the 9th house. Dharma falls at the places of pleasures. When the Sun goes to such places, what shall be its Avastha then? \r\n" + 
				"\r\n" + 
				"We can see that 12th is the house of exaltation of Venus in the natural zodiac. Wherever Shukra (Sex, Passion) is strong, Sun is rendered weak, which is why Venus debilitates Sun. The natural trait of the Sun is to stay away from the materials of pleasures and perform his duty of upholding Dharma diligently. In the places of pleasures, Sun is not allowed to perform his duty. \r\n" + 
				"\r\n" + 
				"This is a well-known fact that among shadripus, which causes the fall of dharma, the ripu of Matsarya or sex causes the greatest fall. This is why anyone who has taken birth on tithes ruled by the Sun, he should overcome the weakness signified by Venus, as per Astadala Padma Scheme. ");
		return sb.toString();
	}

}
