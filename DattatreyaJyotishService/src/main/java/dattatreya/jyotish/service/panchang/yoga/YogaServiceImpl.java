package dattatreya.jyotish.service.panchang.yoga;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dattatreya.jyotish.panchang.yoga.Yoga;







@Service
public class YogaServiceImpl implements YogaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(YogaServiceImpl.class);

	@Autowired
	List<Yoga> yogas;

	@Transactional(readOnly = true)
	@Override
	public Yoga getYoga(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
		Yoga yoga= yogas.get(id-1);
		LOGGER.info("Found todo entry: {}",yoga);
        return yoga;
	}

	

}