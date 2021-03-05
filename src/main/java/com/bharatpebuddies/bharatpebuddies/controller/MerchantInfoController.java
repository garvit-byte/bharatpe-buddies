package com.bharatpebuddies.bharatpebuddies.controller;

import com.bharatpebuddies.bharatpebuddies.dtos.MerchantRequirment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MerchantInfoController {
    private static Logger LOGGER = LoggerFactory.getLogger(MerchantInfoController.class);

    @RequestMapping(value = "/checkBalance", method = RequestMethod.GET)
    public ResponseEntity<?> saveMerchantFeedback(@RequestBody MerchantRequirment merchantRequirment){

        if(isvalidRequest(merchantRequirment)){
            return new ResponseEntity<>()
        }

    }

}
