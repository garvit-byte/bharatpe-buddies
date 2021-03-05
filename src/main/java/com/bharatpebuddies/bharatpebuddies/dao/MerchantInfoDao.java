package com.bharatpebuddies.bharatpebuddies.dao;

import com.bharatpebuddies.bharatpebuddies.entities.MerchantInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MerchantInfoDao extends JpaRepository<MerchantInfo, Long> {

    @Query(value = "SELECT * FROM(\n" +
            "    SELECT *,(((acos(sin((:lat*pi()/180)) * sin((latitude*pi()/180))+cos((:lat*pi()/180)) * cos((latitude*pi()/180)) * cos(((:longi - longitude)*pi()/180))))*180/pi())*60*1.1515*1.609344) as distance FROM merchant_info) t\n" +
            "WHERE distance <=:distance", nativeQuery = true)
    List<MerchantInfo> findAllByNearLatANdLong(String lat, String longi, int distance);
}
