package com.sxt.pojo;

/**
 * exams   com.sxt.pojo
 * 2022-06-26  16:28
 *
 * @author sxt  Administrator
 * description : 不可描述
 * @date 2022/6/26  16:28
 */
public class TeaUser {
    private Integer userid;
    private String username;
    private String userpwd;
    private String truename;
    private Integer classid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
