package com.bharatpebuddies.bharatpebuddies.dao;

import com.bharatpebuddies.bharatpebuddies.entities.DailyNewsFeed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyNewsFeedDao extends JpaRepository<DailyNewsFeed,Long> {

    List<DailyNewsFeed> findAllByOrderByIdDesc();
}
