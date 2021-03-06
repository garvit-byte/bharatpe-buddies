package com.bharatpebuddies.bharatpebuddies.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MerchantRequestDto {
    private Long merchantId;
    private String message;
    private String businessCategory;
    private String businessName;
    private String image;
}
