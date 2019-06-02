package com.edu.bigdata.service;

import com.edu.bigdata.model.StatBean;

import java.util.List;

/**
 * Service
 */
public interface StatService {
    List<StatBean> findThisWeekNewUsers(String appid);
}
