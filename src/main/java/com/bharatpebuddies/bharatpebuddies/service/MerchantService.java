package com.bharatpebuddies.bharatpebuddies.service;

import com.bharatpebuddies.bharatpebuddies.constants.ResponseCode;
import com.bharatpebuddies.bharatpebuddies.dao.MerchantInfoDao;
import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;
import com.bharatpebuddies.bharatpebuddies.entities.MerchantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class MerchantService {

    @Autowired
    MerchantInfoDao merchantInfoDao;

    public ResponseDTO getMerchant(String id) {
        try {
            if (StringUtils.isEmpty(id)) {
                return new ResponseDTO(ResponseCode.BAD_REQUEST, "Id cannot be empty", false);
            }
            Optional<MerchantInfo> merchantInfo = merchantInfoDao.findById(Long.valueOf(id));
            if (ObjectUtils.isEmpty(merchantInfo)) {
                return new ResponseDTO(ResponseCode.BAD_REQUEST, "no merchant found", false);
            }
            return new ResponseDTO(ResponseCode.SUCCESS_200, "SUCCESS", true, merchantInfo.get());
        } catch (Exception exception) {
            return new ResponseDTO(ResponseCode.SOMETHING_WENT_WRONG, "SOMETHING WENT WRONG", false);
        }
    }

}
