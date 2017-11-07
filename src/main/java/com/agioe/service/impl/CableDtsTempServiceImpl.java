package com.agioe.service.impl;

import com.agioe.dao.CableDtsTempDAO;
import com.agioe.entity.CableDtsTemp;
import com.agioe.service.CableDtsTempService;
import com.agioe.utils.BlobUtil;
import com.agioe.vo.CableDtsTempVO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */
@WebService(targetNamespace="http://service.agioe.com/",endpointInterface = "com.agioe.service.CableDtsTempService")
@Component
public class CableDtsTempServiceImpl implements CableDtsTempService {
    @Resource
    CableDtsTempDAO cableDtsTempDAO;
    @Override
    public List<CableDtsTemp> list() {
        return cableDtsTempDAO.findAll();
    }

    @Override
    public List<CableDtsTempVO> queryList() {
        List<CableDtsTemp> list = cableDtsTempDAO.queryList();
        List<CableDtsTempVO> listVO= new ArrayList<CableDtsTempVO>();
        for(CableDtsTemp info : list){
            try {
                CableDtsTempVO cableDtsTempVO = new CableDtsTempVO();
                InputStream inputStream = new ByteArrayInputStream(info.getDtsTempData());
                List<Double> listDouble = BlobUtil.getDatas(inputStream);
                cableDtsTempVO.setId(info.getId());
                cableDtsTempVO.setSegCode(info.getSegCode());
                cableDtsTempVO.setPhaseCode(info.getPhaseCode());
                cableDtsTempVO.setDelMark(info.getDelMark());
                cableDtsTempVO.setUpdateTime(info.getUpdateTime());
                cableDtsTempVO.setSendStatus(info.getSendStatus());
                cableDtsTempVO.setDtsTempDataList(listDouble);
                listVO.add(cableDtsTempVO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listVO;
    }

}
