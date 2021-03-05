package com.bharatpebuddies.bharatpebuddies.service;

import com.bharatpebuddies.bharatpebuddies.constants.ResponseCode;
import com.bharatpebuddies.bharatpebuddies.dao.MerchantInfoDao;
import com.bharatpebuddies.bharatpebuddies.dto.LatLongMechantDto;
import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;
import com.bharatpebuddies.bharatpebuddies.entities.MerchantInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class LatLongService {
    private Logger logger = LoggerFactory.getLogger(LatLongService.class);

    @Autowired
    MerchantInfoDao merchantInfoDao;

    public ResponseDTO getListOfNearMerchants(String lat, String longi) {
        try {
            if (StringUtils.isEmpty(lat) || StringUtils.isEmpty(longi)) {
                return new ResponseDTO(ResponseCode.BAD_REQUEST, "lat or long is empty or null", false);
            }
            List<MerchantInfo> merchantInfoList = merchantInfoDao.findAllByNearLatANdLong(lat, longi, 1);
            if (ObjectUtils.isEmpty(merchantInfoList)) {
                return new ResponseDTO(ResponseCode.BAD_REQUEST, "no merchant found nearby ", false);
            }
            List<LatLongMechantDto> listOfNearByMerchants = new ArrayList<>();

            for (MerchantInfo merchantInfo : merchantInfoList) {
                LatLongMechantDto latLongMechantDto = new LatLongMechantDto();
                latLongMechantDto.setBussinessName(merchantInfo.getBusinessName());
                latLongMechantDto.setMobileNumber(merchantInfo.getMobile());
                latLongMechantDto.setBenificiaryName(merchantInfo.getBeneficiaryName());
                latLongMechantDto.setMerchantId(merchantInfo.getId());
                listOfNearByMerchants.add(latLongMechantDto);
            }
            return new ResponseDTO(ResponseCode.SUCCESS_200, "SUCCESS", true, listOfNearByMerchants);
        } catch (Exception exception) {
            logger.info("EXCEPTION MESSAGE:{} and StackTree : {}", exception.getMessage(), exception.getStackTrace());
            return new ResponseDTO(ResponseCode.SOMETHING_WENT_WRONG, "SOMETHING WENT WRONG", false);
        }

    }
}
