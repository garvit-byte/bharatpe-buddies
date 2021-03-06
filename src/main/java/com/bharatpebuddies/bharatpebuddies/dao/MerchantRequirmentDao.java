package com.bharatpebuddies.bharatpebuddies.dao;

import com.bharatpebuddies.bharatpebuddies.entities.MerchantRequirment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRequirmentDao extends JpaRepository<MerchantRequirment, Long> {

    List<MerchantRequirment> findAllOrderByIdDesc();
}
