package com.agioe.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhye on 2017/11/7.
 */
public class BlobUtil {
    public static List<Double> getDatas(InputStream is) throws IOException {
        List<Double> ret = new ArrayList<Double>();
        byte[] buf = new byte[2];
        int value = 0;
        short realvalue = 0;
        while (is.read(buf) != -1) {
            value = (buf[0] & 0xFF);
            value = (value << 8 | (buf[1] & 0xFF));
            realvalue = (short) value;
            ret.add(getValue((int)realvalue));
        }
        return ret;
    }
    public static Double getValue(Integer dbvalue) {
        if (dbvalue == null) {
            return null;
        } else {
            return (dbvalue - 2732) / 10.00;
        }
    }
}
