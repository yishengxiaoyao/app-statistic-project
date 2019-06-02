package com.edu.bigdata.common;

import java.util.Map;

public class AppEventLog extends AppBaseLog {
    private String eventId; //事件编号
    private Long eventDurationSecs; //事件持续的事件
    private Map<String,String> paramKeyValueMap; //参数键值对

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Long getEventDurationSecs() {
        return eventDurationSecs;
    }

    public void setEventDurationSecs(Long eventDurationSecs) {
        this.eventDurationSecs = eventDurationSecs;
    }

    public Map<String, String> getParamKeyValueMap() {
        return paramKeyValueMap;
    }

    public void setParamKeyValueMap(Map<String, String> paramKeyValueMap) {
        this.paramKeyValueMap = paramKeyValueMap;
    }
}
