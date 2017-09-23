package dattatreya.jyotish.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jyotish.grahas.Graha;

import java.util.List;
import java.util.Optional;

/**
 * https://github.com/pkainulainen/spring-data-jpa-examples/blob/master/query-methods/src/main/java/net/petrikainulainen/springdata/jpa/todo/TodoCrudService.java
 */

@Service
public class GrahaServiceImpl implements GrahaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GrahaServiceImpl.class);

	@Autowired
	List<Graha> grahas;

	@Transactional(readOnly = true)
	@Override
	public Graha getGraha(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
        Graha graha = grahas.get(id-1);
		LOGGER.info("Found todo entry: {}", graha);
        return graha;
	}

	

}