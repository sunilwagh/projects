package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava3")
@Order(value=3)
public final class GuruInBhava3 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 3rd House: \n");
		sb.append("\n JUPITER IN THIRD \r\n" + 
				"\r\n" + 
				"3rd is the house of Parakrama (bravery), Maithuna (copulation) and Death. Mars is the karaka of 3rd house, showing parakrama; because it is the sign of Maithuna, Rahu gets exalted in this house in the natural Zodiac and Jaimini says 3rd is the house of death (Dinau Dine Punya). \r\n" + 
				"Jupiter, being the Devaguru, by nature is a peace-loving planet who signify harmony, universal brotherhood (Vasudaiva Kutumbakam) and wisdom. When such a planet goes to the house of parakrama, he is rendered ineffective under the violent temper of Mars. This is why Jupiter gets debilitated where Mars gets exalted. He can’t withstand the violence of Mars. \r\n" + 
				"\r\n" + 
				"Jupiter being a karaka for dharma, becomes very uncomfortable when it goes to the house of copulation. Like Sun who is rendered ineffective in the house of pleasures of Bed, Jupiter is also rendered ineffective in the house of sex. \r\n" + 
				"\r\n" + 
				"Jupiter is again the prana of the Life force and hence also called the Jiva, where as Mars is the Mrityu karaka. When Jupiter goes to the 3rd house, the house of death, the life force diminishes, more so under the effect of Karaka Mars. \r\n" + 
				"\r\n" + 
				"When we look at the ayana of planets we see that the ayana of Rahu is opposite to that of Jupiter. Hence wherever Rahu is strong, Jupiter is rendered weak. In the Kalachakra we see that the Kala of the Dik goveren by Jupiter, is ruled by Jupiter and hence any Jupiterian activity is prohibited in the Rahu Kala. \n");
		return sb.toString();
	}

}
