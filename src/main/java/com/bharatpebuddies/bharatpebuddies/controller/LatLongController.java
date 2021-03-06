package com.bharatpebuddies.bharatpebuddies.controller;

import com.bharatpebuddies.bharatpebuddies.constants.ResponseCode;
import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;
import com.bharatpebuddies.bharatpebuddies.service.LatLongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LatLongController {

    @Autowired
    LatLongService latLongService;

    @GetMapping("/get_list_of_merchant")
    public ResponseDTO getListOfMerchantNearMe(@RequestParam(name = "lat") String lat , @RequestParam(name = "longi") String longi){
     return latLongService.getListOfNearMerchants(lat,longi);
    }


}
