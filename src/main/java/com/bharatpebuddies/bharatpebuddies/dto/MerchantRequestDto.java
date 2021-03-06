package com.bharatpebuddies.bharatpebuddies.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchantRequestDto {
    private Long merchantId;
    private String message;
    private String businessCategory;
    private String businessName;
    private String image;
}
