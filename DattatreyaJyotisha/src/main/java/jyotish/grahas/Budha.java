package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Nakshatra;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Budha implements Graha{
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	float degrees;
	
    static Set<Name_Of_Rashi> lordOfRashis = new HashSet<Name_Of_Rashi>();
	
    private final static Name_Of_Graha grahaName = Name_Of_Graha.BUDHA;
    private final static Name_Of_Rashi MOOLTRIKONARASHI=Name_Of_Rashi.ARIES;
	private final static Name_Of_Rashi EXALTATION=Name_Of_Rashi.VIRGO;
	private final static Name_Of_Rashi DEBILITATION=Name_Of_Rashi.PISCES;
	private final static Name_Of_Rashi OWN=Name_Of_Rashi.GEMINI;
	private final static Tattva tattva = Tattva.PRITHVI;
	private final static Set<Name_Of_Nakshatra> LORDOFNAKSHATRA = new HashSet<Name_Of_Nakshatra>();
	private final static Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private final static Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	
	
	
	public Rashi getLagnaKundaliRashi() {
		return lagnaKundaliRashi;
	}
	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		this.lagnaKundaliRashi = lagnaKundaliRashi;
	}
	public Nakshatra getNakshatra() {
		return nakshatra;
	}
	public void setNakshatra(Nakshatra nakshatra) {
		this.nakshatra = nakshatra;
	}
	public Bhava getBhava() {
		return bhava;
	}
	public void setBhava(Bhava bhava) {
		this.bhava = bhava;
	}
	public Pada getPada() {
		return pada;
	}
	public void setPada(Pada pada) {
		this.pada = pada;
	}
	
	public static void addLordOfNakshatrasToGraha() {
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.ASHLESHA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.JYESTHA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.REVATI);
		}
	
	public static void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);
		
		}
	
	public static void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		
		
		}
	
	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
		
		}
	
	public static void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);
		
		}
	public static Set<Name_Of_Rashi> getLordOfRashis() {
		return lordOfRashis;
	}
	public static void setLordOfRashis(Set<Name_Of_Rashi> lordOfRashis) {
		Budha.lordOfRashis = lordOfRashis;
	}
	public static Name_Of_Graha getGrahaname() {
		return grahaName;
	}
	public static Name_Of_Rashi getMooltrikonarashi() {
		return MOOLTRIKONARASHI;
	}
	public static Name_Of_Rashi getExaltation() {
		return EXALTATION;
	}
	public static Name_Of_Rashi getDebilitation() {
		return DEBILITATION;
	}
	public static Name_Of_Rashi getOwn() {
		return OWN;
	}
	public static Tattva getTattva() {
		return tattva;
	}
	public static Set<Name_Of_Nakshatra> getLordofnakshatra() {
		return LORDOFNAKSHATRA;
	}
	public static Set<Name_Of_Bhava> getKaraka() {
		return KARAKA;
	}
	public static Set<Name_Of_Graha> getEnemiesToGraha() {
		return ENEMIES_TO_GRAHA;
	}
	public static Set<Name_Of_Graha> getFriendsToGraha() {
		return FRIENDS_TO_GRAHA;
	}
	public static Set<Name_Of_Graha> getNuetralToGraha() {
		return NUETRAL_TO_GRAHA;
	}
	public float getDegrees() {
		return degrees;
	}
	public void setDegrees(float degrees) {
		this.degrees = degrees;
	}
	
	


}
