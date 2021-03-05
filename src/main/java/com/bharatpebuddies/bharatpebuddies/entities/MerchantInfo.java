package com.bharatpebuddies.bharatpebuddies.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "merchant_info")
public class MerchantInfo extends BaseEntity {
    @Column(name = "mid")
    private String mid;

    @Column(name = "secret")
    private String secret;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_category")
    private String businessCategory;

    @Column(name = "merchant_type")
    private String merchantType;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "phone")
    private String phone;

    @Column(name = "settlement_type")
    private String settlementType;

    @Column(name = "settlement_mode")
    private String settlementMode;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "referal_code")
    private String referalCode;

    @Column(name = "status")
    private String status;

    @Column(name = "txn_count")
    private Integer txnCount;

    @Column(name = "settlement_level")
    private String settlementLevel;

    @Column(name = "kyc_type")
    private String kycType;

    @Column(name = "merchant_logo")
    private String merchantLogo;

    @Column(name = "beneficiary_name")
    private String beneficiaryName;

    @Column(name = "shop_type")
    private String shopType;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "other_category")
    private String otherCategory;

    @Column(name = "company_type")
    private String companyType;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gstn_no")
    private String gstn_no;

}
