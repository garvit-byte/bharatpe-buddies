package com.bharatpe.oltp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MerchantController {

    private ObjectMapper objectMapper;

    @Autowired
    private MerchantInfoDao merchantInfoDao;

    @RequestMapping(value="/merchant/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MerchantInfo> getMerchant(@RequestBody String rawRequest){
        try{
            Map<String, String> requestBody = objectMapper.readValue(rawRequest, Map.class);
            Long id = Long.valueOf(requestBody.get("id"));
            return merchantInfoDao.getById(id);
        }catch(Exception ex){
            return new List<MerchantInfo>();
        }
    }
}