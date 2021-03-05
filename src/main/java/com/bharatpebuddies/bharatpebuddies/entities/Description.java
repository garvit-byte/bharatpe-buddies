package com.bharatpebuddies.bharatpebuddies.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "decription")
public class Description {

    @Column(name = "merchant_id")
    private Long merchant_id;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_category")
    private String businessCategory;

    @Column(name = "decription_message")
    private String decriptionMessage;

}
