package dattatreya.jyotish.grahas;

import java.util.Set;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

public interface Graha {

	

	public Nakshatra getNakshatra();

	public void setNakshatra(Nakshatra nakshatra);

	public Bhava getBhava();

	public void setBhava(Bhava bhava);

	public Pada getPada();

	public void setPada(Pada pada);

	public double getDegrees();

	public void setDegrees(double degrees);

	public GrahaNames getGrahaName();

	public RashiNames getMOOLTRIKONARASHI();

	public RashiNames getEXALTATION();

	public RashiNames getDEBILITATION();

	public RashiNames getOWN();

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA();

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA();

	public Tattva getTATTVA();

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS();

	public Guna getGUNA();

	public Set<RashiNames> getLORD_OF_RASHIS();

	public Set<BhavaNames> getKARAKA();

	public Set<GrahaNames> getENEMIES_TO_GRAHA();

	public Set<GrahaNames> getFRIENDS_TO_GRAHA();

	public Set<GrahaNames> getNUETRAL_TO_GRAHA();

	public Set<BhavaNames> getSTRONGEST();

	public Set<BhavaNames> getSTRONG();

	public Set<BhavaNames> getNUETRAL();

	public Set<BhavaNames> getWEAK();

	public Set<BhavaNames> getWEAKEST();
}
