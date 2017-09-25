package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("budha")
@Order(value=4)
public final class Budha implements Graha {

	private  final GrahaNames GRAHA_NAME = GrahaNames.BUDHA;
	private  final RashiNames MOOLTRIKONARASHI = RashiNames.VIRGO;
	private  final RashiNames EXALTATION = RashiNames.VIRGO;
	private  final RashiNames DEBILITATION = RashiNames.PISCES;
	private  final RashiNames OWN = RashiNames.GEMINI;
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private  final Tattva TATTVA = Tattva.PRITHVI;
	private  final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private  final Guna GUNA = Guna.RAJASIC;
	private  final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private  final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private  final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<BhavaNames> STRONGEST_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> STRONG_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> NUETRAL_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAK_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAKEST_IN_BHAVAS = new HashSet<BhavaNames>();

	public Budha() 
	{
		addFriendsToGraha();
		addEnemiesToGraha();
		addLordOfNakshatrasToGraha();
		addKarakasToGraha();
		addLordOfRashisToGraha();
		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();

	}

	public  void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.ASHLESHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.JYESTHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.REVATI);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.VIRGO);
		LORD_OF_RASHIS.add(RashiNames.GEMINI);

	}

	public  void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public  void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.CHANDRA);

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SURYA);
		FRIENDS_TO_GRAHA.add(GrahaNames.SHUKRA);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(GrahaNames.MANGAL);
		NUETRAL_TO_GRAHA.add(GrahaNames.GURU);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHANI);

	}

	public  void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(BhavaNames.BHAVA1);
	}

	public  void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA2);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA4);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA5);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA9);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA10);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA11);

	}

	public  void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA3);

	}

	public  void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA6);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA8);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA12);

	}

	public  void addBhavasToWeakest() {
		WEAKEST_IN_BHAVAS.add(BhavaNames.BHAVA7);

	}

	private Rashi lagnaKundaliRashi;
	private Nakshatra nakshatra;
	private Bhava bhava;
	private Pada pada;
	private double degrees;

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

	public double getDegrees() {
		return degrees;
	}

	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}

	public  Set<RashiNames> getLORD_OF_RASHIS() {
		return LORD_OF_RASHIS;
	}

	public  GrahaNames getGrahaName() {
		return GRAHA_NAME;
	}

	public  RashiNames getMooltrikonarashi() {
		return MOOLTRIKONARASHI;
	}

	public  RashiNames getExaltation() {
		return EXALTATION;
	}

	public  RashiNames getDebilitation() {
		return DEBILITATION;
	}

	public  RashiNames getOwn() {
		return OWN;
	}

	public  Tattva getTattva() {
		return TATTVA;
	}

	public  Set<BhavaNames> getKaraka() {
		return KARAKA;
	}

	public  Set<GrahaNames> getEnemiesToGraha() {
		return ENEMIES_TO_GRAHA;
	}

	public  Set<GrahaNames> getFriendsToGraha() {
		return FRIENDS_TO_GRAHA;
	}

	public  Set<GrahaNames> getNuetralToGraha() {
		return NUETRAL_TO_GRAHA;
	}

	public  Guna getGuna() {
		return GUNA;
	}

	public  Set<BhavaNames> getStrongest() {
		return STRONGEST_IN_BHAVAS;
	}

	public  Set<BhavaNames> getStrong() {
		return STRONG_IN_BHAVAS;
	}

	public  Set<BhavaNames> getWeak() {
		return WEAK_IN_BHAVAS;
	}

	public  Set<BhavaNames> getWeakest() {
		return WEAKEST_IN_BHAVAS;
	}

	public GrahaNames getGRAHA_NAME() {
		return GRAHA_NAME;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public RashiNames getOWN() {
		return OWN;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
	}

	public Guna getGUNA() {
		return GUNA;
	}

	public Set<BhavaNames> getKARAKA() {
		return KARAKA;
	}

	public Set<GrahaNames> getENEMIES_TO_GRAHA() {
		return ENEMIES_TO_GRAHA;
	}

	public Set<GrahaNames> getFRIENDS_TO_GRAHA() {
		return FRIENDS_TO_GRAHA;
	}

	public Set<GrahaNames> getNUETRAL_TO_GRAHA() {
		return NUETRAL_TO_GRAHA;
	}

	public Set<BhavaNames> getSTRONGEST_IN_BHAVAS() {
		return STRONGEST_IN_BHAVAS;
	}

	public Set<BhavaNames> getSTRONG_IN_BHAVAS() {
		return STRONG_IN_BHAVAS;
	}

	public Set<BhavaNames> getNUETRAL_IN_BHAVAS() {
		return NUETRAL_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAK_IN_BHAVAS() {
		return WEAK_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAKEST_IN_BHAVAS() {
		return WEAKEST_IN_BHAVAS;
	}

	public Set<BhavaNames> getSTRONGEST() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getSTRONG() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getNUETRAL() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAK() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAKEST() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
