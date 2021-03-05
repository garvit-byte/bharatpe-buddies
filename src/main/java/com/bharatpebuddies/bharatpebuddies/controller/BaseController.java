package com.bharatpebuddies.bharatpebuddies.controller;

import com.bharatpebuddies.bharatpebuddies.dto.ResponseDTO;

public class BaseController {

    protected ResponseDTO getSuccessResponse(Object data) {
        ResponseDTO responseDto = new ResponseDTO("100", "OK", Boolean.TRUE);
        responseDto.setData(data);
        return responseDto;
    }

    protected ResponseDTO getFailureResponse() {
        return new ResponseDTO("500", "Something went wrong!", Boolean.FALSE);
    }
}
