package com.bharatpebuddies.bharatpebuddies.dao;

import com.bharatpebuddies.bharatpebuddies.entities.MerchantInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantInfoDao extends JpaRepository<MerchantInfo, Long> {
    List<MerchantInfo> getById(Long id);
}
