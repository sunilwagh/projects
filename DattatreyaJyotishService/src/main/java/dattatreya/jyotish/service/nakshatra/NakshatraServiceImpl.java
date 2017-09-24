package dattatreya.jyotish.service.nakshatra;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dattatreya.jyotish.nakshatras.Nakshatra;





/**
 * https://github.com/pkainulainen/spring-data-jpa-examples/blob/master/query-methods/src/main/java/net/petrikainulainen/springdata/jpa/todo/TodoCrudService.java
 */

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