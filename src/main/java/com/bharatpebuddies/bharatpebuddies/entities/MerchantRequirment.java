package com.bharatpebuddies.bharatpebuddies.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "merchant_requirment")
public class MerchantRequirment extends BaseEntity {

    private Long merchantId;
    private String message;
    private String businessCategory;
    private String businessName;
    private String image;

}
