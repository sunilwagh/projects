package dattatreya.jyotish.rashis;

import java.util.List;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.EvenOdd;
import dattatreya.jyotish.util.RashiNames;

public interface Rashi {
	
	public List<Graha> getGrahas();
	public void setGrahas(List<Graha> grahas);
	public RashiNames getNameOfRashi();
	public EvenOdd getEvenOddSign();

}
