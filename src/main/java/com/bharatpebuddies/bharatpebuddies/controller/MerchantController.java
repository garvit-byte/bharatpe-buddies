package com.bharatpebuddies.bharatpebuddies.controller;

import com.bharatpebuddies.bharatpebuddies.dao.MerchantInfoDao;
import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;
import com.bharatpebuddies.bharatpebuddies.entities.MerchantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MerchantController {

    @Autowired
    private MerchantInfoDao merchantInfoDao;

    @RequestMapping(value="/merchant/get",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO<?> getMerchant(@RequestParam String id){
        try{
            if(id == null) {
                return new ResponseDTO<>("FAILED", "Id not valid", true, null);
            }
            Optional<MerchantInfo> merchantInfoOptional = merchantInfoDao.findById(Long.valueOf(id));
            if(!merchantInfoOptional.isPresent()){
                return new ResponseDTO<>()
            }


            return new ResponseDTO<>("SUCCESS","List of all merchants",true,data);
        }catch(Exception ex){
            return new ResponseDTO<>("FAILED","Id not valid",true,null);
        }
    }
}