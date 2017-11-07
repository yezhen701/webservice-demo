package com.agioe.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */

public class CableDtsTempVO {
    private Integer id;
    private Integer segCode;//电缆段编号
    private Integer phaseCode;//电缆相位编号
    private Integer delMark;//DEFAULT '0' 载流量使用标记
    private Date updateTime;//更新时间
    private Integer sendStatus;// DEFAULT '0' 上传状态 0-未上传 1-已上传
    private List<Double> dtsTempDataList;//温度List

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSegCode() {
        return segCode;
    }

    public void setSegCode(Integer segCode) {
        this.segCode = segCode;
    }

    public Integer getPhaseCode() {
        return phaseCode;
    }

    public void setPhaseCode(Integer phaseCode) {
        this.phaseCode = phaseCode;
    }

    public List<Double> getDtsTempDataList() {
        return dtsTempDataList;
    }

    public void setDtsTempDataList(List<Double> dtsTempDataList) {
        this.dtsTempDataList = dtsTempDataList;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }
}
