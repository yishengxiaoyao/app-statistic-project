package com.edu.bigdata.repository;

import com.edu.bigdata.model.StatBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatBeanRepository extends JpaRepository<StatBean,String> {

    @Query(value = "select formattime(t.mintime,'yyyy/MM/dd') as stdate , " +
            "count(1) as stcount from (select deviceid, min(createdatms) as mintime " +
            "from ext_startup_logs where appid = ?1 group by deviceid " +
            "having mintime >= getweekbegin() and mintime &lt; getweekbegin(1)) t " +
            "group by formattime(t.mintime,'yyyy/MM/dd')",nativeQuery = true)
    public List<StatBean> findThisWeekNewUsers(String appId);
}
