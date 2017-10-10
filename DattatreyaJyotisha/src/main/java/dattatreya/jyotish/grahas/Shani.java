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
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;


@Component("shani")
@Order(value=7)
public final class Shani implements Graha {

	private final GrahaNames grahaName = GrahaNames.SHANI;
	private final Set<RashiNames> LORDOFRASHIS = new HashSet<RashiNames>();
	private final GrahaNames GRAHA_NAME = GrahaNames.SHANI;
	private final RashiNames MOOLTRIKONARASHI = RashiNames.ACQUARIUS;
	private final RashiNames EXALTATION = RashiNames.LIBRA;
	private final RashiNames DEBILITATION = RashiNames.ARIES;
	private final RashiNames OWN = RashiNames.CAPRICORN;

	private final Tattva TATTVA = Tattva.VAYU;
	private final Guna GUNA = Guna.TAMASIC;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.KURMA;
	private final Mahavidya mahaVidya = Mahavidya.DAKSHINAKALI;
	
	
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
    private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	public Shani()
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

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.PUSHYA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.ANURADHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_BHADRAPADA);
	}

	private void addLordOfRashisToGraha() {
		LORDOFRASHIS.add(RashiNames.CAPRICORN);
		LORDOFRASHIS.add(RashiNames.ACQUARIUS);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.SURYA);
		ENEMIES_TO_GRAHA.add(GrahaNames.CHANDRA);
		ENEMIES_TO_GRAHA.add(GrahaNames.MANGAL);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.BUDHA);
		FRIENDS_TO_GRAHA.add(GrahaNames.SHUKRA);
	}

	public void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(GrahaNames.GURU);
	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA7);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA6);
		STRONG.add(BhavaNames.BHAVA10);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {

	}

	public void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA2);
		WEAK.add(BhavaNames.BHAVA4);
		WEAK.add(BhavaNames.BHAVA5);
		WEAK.add(BhavaNames.BHAVA9);
		WEAK.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeakest() {
		WEAKEST.add(BhavaNames.BHAVA1);

	}

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
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

	public Set<RashiNames> getLORDOFRASHIS() {
		return LORDOFRASHIS;
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

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
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

	public Guna getGUNA() {
		return GUNA;
	}

	public Set<BhavaNames> getSTRONGEST() {
		return STRONGEST;
	}

	public Set<BhavaNames> getSTRONG() {
		return STRONG;
	}

	public Set<BhavaNames> getNUETRAL() {
		return NUETRAL;
	}

	public Set<BhavaNames> getWEAK() {
		return WEAK;
	}

	public Set<BhavaNames> getWEAKEST() {
		return WEAKEST;
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		// TODO Auto-generated method stub
		return null;
	}

	public GrahaNames getGrahaName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMooltrikonarashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getExaltation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDebilitation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOwn() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tattva getTattva() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKaraka() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGuna() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrongest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeak() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeakest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}
	
	

}
