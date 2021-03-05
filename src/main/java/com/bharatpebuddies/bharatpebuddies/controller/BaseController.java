package com.bharatpebuddies.bharatpebuddies.controller;

public class BaseController {

    protected ResponseDto getSuccessResponse(Object data) {
        ResponseDto responseDto = new ResponseDto("100", "OK", Status.ApiStatus.OK.name());
        responseDto.setData(data);
        return responseDto;
    }

    protected ResponseDto getFailureResponse() {
        return new ResponseDto("500", "Something went wrong!", Status.ApiStatus.FAIL.name());
    }

    protected ResponseDto getCustomResponse(Object data, String responseCode, String responseMessage, String status) {
        ResponseDto responseDto = new ResponseDto(responseCode, responseMessage, status, data);
        return responseDto;
    }
}
