package com.agioe.dao;

import com.agioe.entity.CableDtsTemp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */
@Mapper
public interface CableDtsTempDAO extends JpaRepository<CableDtsTemp, Integer> {
    @Query(value="select id,seg_code,phase_code,UNCOMPRESS(dts_temp_data) dts_temp_data,del_mark,update_time,send_status from cable_dts_temp",nativeQuery=true)//原生sql语句
    List<CableDtsTemp> queryList();

}
