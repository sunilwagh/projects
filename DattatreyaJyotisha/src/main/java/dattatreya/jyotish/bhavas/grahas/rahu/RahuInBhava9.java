package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava9")
@Order(value = 9)
public final class RahuInBhava9 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 9th House: \n");
		sb.append(
				"Rahu in the 9th house, you will need to control people through knowledge. You have a potential to become a great teacher but poorly placed it will result in to extreme self righteousness and teaching wrong kind of doctrine.Cult gurus and politicians have this. AHU IN NINTH \r\n" + 
				"\r\n" + 
				"Rahu is the planet that signifies adharma and hence is the primary cause of Rebirth, which is based on the misdeeds (adharma), which we had committed in our last birth. On the contrary 9th is the house of Dharma and the most important house of the Dharma Trikona as far as the duties and obligations are concerned. When the primary karaka for Adharma goes to the place of dharma, the 9th house that signify the religious shrines and dharmic places, he feels completely dejected for the crimes he has committed through out his life. The feeling that it is better to die than to live with the heavy burden of sing on his head, engrosses him completely. He becomes remorseful. \r\n" + 
				"\r\n" + 
				"Between the two karakas for 9th or dharma, viz., Jupiter and the Sun, Sun becomes a yogi planet and does not do much harm to Rahu. However, Devaguru is agitated, when the devalayas or the place of worship is desecrated by the presence of Jupiter. Jupiter’s ire is unfathomable, when he becomes angry. Such severe beatings he gives that Rahu is taken to the state of dying. No, wonder when Jupiter gets agitated, all sins are burnt through the sacred fire or Pavitra Agni of the Devaguru. \r\n" + 
				"\r\n" + 
				"This shall be interesting to note here that Rahu gets into debilitation in the 9th house of Natural Zodiac, ruled by Jupiter. The sign Sagittarius is again a agni-tattwa rasi, which has the power to burn all sins. This one of the reasons, why agitated Jupiter show widespread fire during the Manduka Dasa. ");
		return sb.toString();
	}

}
