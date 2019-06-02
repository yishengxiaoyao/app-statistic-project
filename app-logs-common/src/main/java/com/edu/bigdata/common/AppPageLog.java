package com.edu.bigdata.common;
/**
 * 应用上报的页面相关信息
 */
public class AppPageLog extends AppBaseLog {
    private String pageId; //页面Id
    private int visitIndex=0; //访问顺序
    private String nextPage; //下一页
    private Long stayDurationSecs=0L; //当前页面停留时长

    public int getVisitIndex() {
        return visitIndex;
    }

    public void setVisitIndex(int visitIndex) {
        this.visitIndex = visitIndex;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public Long getStayDurationSecs() {
        return stayDurationSecs;
    }

    public void setStayDurationSecs(Long stayDurationSecs) {
        this.stayDurationSecs = stayDurationSecs;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
