package dattatreya.jyotish.service.nakshatra;

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
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;


@RestController
@RequestMapping("/nakshatra")
final class NakshatraController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NakshatraController.class);
    private NakshatraService nakshatraService;

    
    @Autowired
    public NakshatraController(NakshatraService nakshatraService) {
        this.nakshatraService = nakshatraService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Nakshatra getNakshtra(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Nakshatra nakshtra = nakshatraService.getNakshatra(id);
        LOGGER.info("Found todo entry: {}", nakshtra);
        return nakshtra;
    }

   
    
    
  
    
    
    
}