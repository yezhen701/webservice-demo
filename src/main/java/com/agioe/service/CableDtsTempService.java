package com.agioe.service;

import com.agioe.entity.CableDtsTemp;
import com.agioe.vo.CableDtsTempVO;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */
@WebService(name = "CableDtsTempService", targetNamespace = "http://service.agioe.com/")
public interface CableDtsTempService {
    List<CableDtsTemp> list ();
    List<CableDtsTempVO> queryList ();
}
