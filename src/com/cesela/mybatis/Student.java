package com.cesela.mybatis;

import javax.lang.model.element.NestingKind;

/**
 * @Date:2020/4/30 14:08
 */

public class Student {
    private String sid;
    private String sname;
    private String sbirth;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSbirth() {
        return sbirth;
    }

    public void setSbirth(String sbirth) {
        this.sbirth = sbirth;
    }
}
