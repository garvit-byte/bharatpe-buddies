package com.bharatpebuddies.bharatpebuddies.dtos;

import lombok.Data;

@Data
public class MerchantRequestDto {

    private Long merchantId;
    private String message;
    private String businessCategory;
    private String businessName;

}
