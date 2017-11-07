package com.agioe.controller;

import com.agioe.service.CableDtsTempService;
import com.agioe.vo.CableDtsTempVO;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */
@RestController
@RequestMapping("/cabledtstemp")
public class CableDtsTempController {
    @Autowired
    CableDtsTempService cableDtsTempService;
    /**
     * @return 查询温度信息
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public List<CableDtsTempVO> selectList() {

        List<String>strings = new ArrayList<String>();
        strings.add("1");
        strings.add("2");
        Joiner joiner = Joiner.on("").skipNulls();
        System.out.println(joiner.join(strings));
        return cableDtsTempService.queryList();
    }

}
