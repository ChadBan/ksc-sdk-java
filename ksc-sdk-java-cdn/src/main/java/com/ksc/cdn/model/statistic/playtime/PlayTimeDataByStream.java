package com.ksc.cdn.model.statistic.playtime;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/13.
 */
public class PlayTimeDataByStream {
    /**
     * 流名
     */
    private String StreamUrl;
    /**
     * 访问次数总和
     */
    private Long TotalSv;
    /**
     * 总播放时长
     */
    private Long TotalPlayTime;
    /**
     * 平均播放时长，单位毫秒
     */
    private Long PlayTime;

    /**
     * 该流名在每个区域的观看时长数据
     */
    private List<PlayTimeDataByRegion> Regions;

    public String getStreamUrl() {
        return StreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        StreamUrl = streamUrl;
    }

    public Long getTotalSv() {
        return TotalSv;
    }

    public void setTotalSv(Long totalSv) {
        TotalSv = totalSv;
    }

    public Long getTotalPlayTime() {
        return TotalPlayTime;
    }

    public void setTotalPlayTime(Long totalPlayTime) {
        TotalPlayTime = totalPlayTime;
    }

    public Long getPlayTime() {
        return PlayTime;
    }

    public void setPlayTime(Long playTime) {
        PlayTime = playTime;
    }

    public List<PlayTimeDataByRegion> getRegions() {
        return Regions;
    }

    public void setRegions(List<PlayTimeDataByRegion> regions) {
        Regions = regions;
    }
}
