package com.bharatpebuddies.bharatpebuddies.dao;

import com.bharatpebuddies.bharatpebuddies.entities.Description;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DescriptionDao extends JpaRepository<Description,Long> {
    List<Description> findByMerchantId(Long merchantId);
}
