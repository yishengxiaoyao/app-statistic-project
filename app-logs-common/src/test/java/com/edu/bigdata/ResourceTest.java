package com.edu.bigdata;

import com.edu.bigdata.util.GeoUtil;
import org.junit.Test;

public class ResourceTest {

    @Test
    public  void testIP(){
        System.out.println(GeoUtil.getProvince("61.49.59.30"));
        System.out.println(GeoUtil.getCountry("61.49.59.30"));
    }
}
