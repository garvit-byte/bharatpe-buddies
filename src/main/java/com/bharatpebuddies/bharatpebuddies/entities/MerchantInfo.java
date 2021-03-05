package com.bharatpebuddies.bharatpebuddies.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "merchant_info")
public class MerchantInfo extends BaseEntity{
    @Column(name = "merchant_id")
    private String mid;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "category")
    private String businessCategory;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "beneficiary_name")
    private String beneficiaryName;

    @Column(name = "Review_comments")
    private String reviewComments;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "mobile_number")
    private String mobile;

}
