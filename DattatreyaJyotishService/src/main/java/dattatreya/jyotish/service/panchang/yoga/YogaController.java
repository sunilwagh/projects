package dattatreya.jyotish.service.panchang.yoga;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dattatreya.jyotish.panchang.yoga.Yoga;


@RestController
@RequestMapping("/yoga")
final class YogaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(YogaController.class);
    private YogaService yogaService;

    
    @Autowired
    public YogaController(YogaService yogaService) {
        this.yogaService = yogaService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Yoga getYoga(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Yoga yoga = yogaService.getYoga(id);
        LOGGER.info("Found todo entry: {}", yoga);
        return yoga;
    }

   
    
    
  
    
    
    
}