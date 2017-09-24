package dattatreya.jyotish.service.rashi;

import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.nakshatras.Nakshatra;
import dattatreya.jyotish.rashis.Rashi;


@RestController
@RequestMapping("/rashi")
final class RashiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RashiController.class);
    private RashiService rashiService;

    
    @Autowired
    public RashiController(RashiService rashiService) {
        this.rashiService = rashiService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Rashi getNakshtra(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Rashi rashi = rashiService.getRashi(id);
        LOGGER.info("Found todo entry: {}", rashi);
        return rashi;
    }

   
    
    
  
    
    
    
}