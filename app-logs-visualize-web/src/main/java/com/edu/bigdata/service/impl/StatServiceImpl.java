package com.edu.bigdata.service.impl;

import com.edu.bigdata.model.StatBean;
import com.edu.bigdata.repository.StatBeanRepository;
import com.edu.bigdata.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 统计服务
 */
@Service
public class StatServiceImpl implements StatService {


    @Autowired
    private StatBeanRepository statBeanRepository;


    @Override
    public List<StatBean> findThisWeekNewUsers(String appId) {
        return statBeanRepository.findThisWeekNewUsers(appId);
    }
}