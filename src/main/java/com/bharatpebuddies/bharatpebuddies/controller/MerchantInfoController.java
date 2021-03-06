package com.bharatpebuddies.bharatpebuddies.controller;

import com.bharatpebuddies.bharatpebuddies.dao.MerchantRequirmentDao;
import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;
import com.bharatpebuddies.bharatpebuddies.dtos.MerchantRequestDto;
import com.bharatpebuddies.bharatpebuddies.entities.MerchantRequirment;
import com.bharatpebuddies.bharatpebuddies.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MerchantInfoController extends BaseController {
    private static Logger LOGGER = LoggerFactory.getLogger(MerchantInfoController.class);

    @Autowired
    private MerchantRequirmentDao merchantRequirmentDao;

    @Autowired
    private MerchantService merchantService;

    @RequestMapping(value = "/merchant/requirment", method = RequestMethod.POST)
    public ResponseEntity<?> saveMerchantFeedback(@RequestBody MerchantRequestDto merchantRequestDto) {
        LOGGER.info("Start setting up attribute in Merchant requirment table");
        if (!isvalidRequest(merchantRequestDto)) {
            return new ResponseEntity<>(getFailureResponse(), HttpStatus.OK);
        }
        MerchantRequirment merchantRequirment = new MerchantRequirment();
        merchantRequirment.setMerchantId(merchantRequestDto.getMerchantId());
        merchantRequirment.setMessage(merchantRequestDto.getMessage());
        merchantRequirment.setBusinessName(merchantRequestDto.getBusinessName());
        merchantRequirment.setBusinessCategory(merchantRequestDto.getBusinessCategory());
        merchantRequirment.setImage(merchantRequestDto.getImage());
        merchantRequirmentDao.save(merchantRequirment);
        LOGGER.info("merchant requirment table for id :{}", merchantRequirment.getId());
        return new ResponseEntity<>(getSuccessResponse(merchantRequirment), HttpStatus.OK);
    }

    @GetMapping("/getMerchant")
    public ResponseDTO getListOfMerchantNearMe(@RequestParam(name = "id") String id) {
        return merchantService.getMerchant(id);
    }

    @GetMapping("/fetch_post")
    public ResponseDTO getPost(@RequestParam(value = "fetchAll") Boolean fetchAll) {
        return merchantService.getAllPost();
    }

    @GetMapping("/news_feed")
    public ResponseDTO getNewsFeed(@RequestParam(value = "fetchAll") Boolean fetchAll) {
        return merchantService.getAllNewsFeeed();
    }

    private boolean isvalidRequest(MerchantRequestDto merchantRequestDto) {
        if (merchantRequestDto.getMerchantId() == null)
            return false;
        else
            return true;

    }


}
