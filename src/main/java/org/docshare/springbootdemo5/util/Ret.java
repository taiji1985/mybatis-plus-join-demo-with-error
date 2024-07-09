package org.docshare.springbootdemo5.util;

import lombok.Data;

@Data
public class Ret {
    private int code;

    private String msg;

    private Object data;
    public static Ret ok(Object data){
        Ret ret = new Ret();
        ret.setCode(200);
        ret.setData(data);
        ret.setMsg("ok");

        return ret;

    }
}
