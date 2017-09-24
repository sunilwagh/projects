package dattatreya.jyotish.service.rashi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.rashis.Rashi;


@Service
public class RashiServiceImpl implements RashiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RashiServiceImpl.class);

	@Autowired
	List<Rashi> rashis;

	@Transactional(readOnly = true)
	@Override
	public Rashi getRashi(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
		Rashi rashi= rashis.get(id-1);
		LOGGER.info("Found todo entry: {}",rashi);
        return rashi;
	}

	

}