package com.agioe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zhye on 2017/11/7.
 */
@Entity
@Table(name="cable_dts_temp")
public class CableDtsTemp {
    @Id
    private Integer id;
    private Integer segCode;//电缆段编号
    private Integer phaseCode;//电缆相位编号
    private byte[] dtsTempData;//温度数据
    private Integer delMark;//DEFAULT '0' 载流量使用标记
    private Date updateTime;//更新时间
    private Integer sendStatus;// DEFAULT '0' 上传状态 0-未上传 1-已上传

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

    public byte[] getDtsTempData() {
        return dtsTempData;
    }

    public void setDtsTempData(byte[] dtsTempData) {
        this.dtsTempData = dtsTempData;
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
