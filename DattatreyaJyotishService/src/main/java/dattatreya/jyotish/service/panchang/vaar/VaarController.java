package dattatreya.jyotish.service.panchang.vaar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dattatreya.jyotish.panchang.vaar.Vaar;




@RestController
@RequestMapping("/vaar")
final class VaarController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VaarController.class);
    private VaarService vaarService;

    
    @Autowired
    public VaarController(VaarService vaarService) {
        this.vaarService = vaarService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Vaar getVaar(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Vaar vaar = vaarService.getVaar(id);
        LOGGER.info("Found todo entry: {}", vaar);
        return vaar;
    }

   
    
    
  
    
    
    
}