package dattatreya.jyotish.service.panchang.tithi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dattatreya.jyotish.panchang.tithis.Tithi;






@Service
public class TithiServiceImpl implements TithiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TithiServiceImpl.class);

	@Autowired
	List<Tithi> tithis;

	@Transactional(readOnly = true)
	@Override
	public Tithi getTithi(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
		Tithi tithi= tithis.get(id-1);
		LOGGER.info("Found todo entry: {}",tithi);
        return tithi;
	}

	

}