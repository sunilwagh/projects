package dattatreya.jyotish.bhavas;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

public interface Bhava {

	Rashi getRashi();
	
	void setRashi(Rashi rashi);
	
	BhavaNames getName();

}
