package dattatreya.jyotish.grahas;

import java.util.Set;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;

public interface Graha {

	public double getDegrees();

	public GrahaNames getGrahaName();

	public RashiNames getExaltationRashi();

	public RashiNames getMooltrikonaRashi();

	public RashiNames getOwnRashi();

	public Set<RashiNames> getGREAT_FRIEND_SIGNS_TO_GRAHA();

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA();

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA();

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA();

	public Set<RashiNames> getGREAT_ENEMY_SIGNS_TO_GRAHA();

	public RashiNames getDebilitationRashi();

}
