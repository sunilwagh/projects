package dattatreya.jyotish.service.panchang.nakshatra;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dattatreya.jyotish.panchang.nakshatras.Nakshatra;


@Service
public class NakshatraServiceImpl implements NakshatraService {

	private static final Logger LOGGER = LoggerFactory.getLogger(NakshatraServiceImpl.class);

	@Autowired
	List<Nakshatra> nakshatras;

	@Transactional(readOnly = true)
	@Override
	public Nakshatra getNakshatra(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
        Nakshatra nakshatra= nakshatras.get(id-1);
		LOGGER.info("Found todo entry: {}",nakshatra);
        return nakshatra;
	}

	

}