package dattatreya.jyotish.service.panchang.karana;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dattatreya.jyotish.panchang.karana.Karana;


/**
 * https://github.com/pkainulainen/spring-data-jpa-examples/blob/master/query-methods/src/main/java/net/petrikainulainen/springdata/jpa/todo/TodoCrudService.java
 */

@Service
public class KaranaServiceImpl implements KaranaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(KaranaServiceImpl.class);

	@Autowired
	List<Karana> karanas;

	@Transactional(readOnly = true)
	@Override
	public Karana getKarana(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
        Karana karana= karanas.get(id-1);
		LOGGER.info("Found todo entry: {}",karana);
        return karana;
	}

	

}