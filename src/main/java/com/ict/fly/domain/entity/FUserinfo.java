package com.ict.fly.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class FUserinfo implements Serializable {
    /**
     * id
     */
    private Integer userinfoId;

    /**
     * 用户名
     */
    private String uUsername;

    /**
     * 姓名
     */
    private String uName;

    /**
     * 性别：男 0，女 1
     */
    private Integer uSex;

    /**
     * 年龄
     */
    private Integer uAge;

    /**
     * 需求
     */
    private String uDemand;

    /**
     * 是否为vip用户 默认0  不是( 0 ) , 是( 1 )
     */
    private Integer uVip;

    /**
     * 创建时间
     */
    private Date uCreatime;

    /**
     * 密码
     */
    private String uPassword;

    private static final long serialVersionUID = 1L;

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getuDemand() {
        return uDemand;
    }

    public void setuDemand(String uDemand) {
        this.uDemand = uDemand;
    }

    public Integer getuVip() {
        return uVip;
    }

    public void setuVip(Integer uVip) {
        this.uVip = uVip;
    }

    public Date getuCreatime() {
        return uCreatime;
    }

    public void setuCreatime(Date uCreatime) {
        this.uCreatime = uCreatime;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FUserinfo other = (FUserinfo) that;
        return (this.getUserinfoId() == null ? other.getUserinfoId() == null : this.getUserinfoId().equals(other.getUserinfoId()))
            && (this.getuUsername() == null ? other.getuUsername() == null : this.getuUsername().equals(other.getuUsername()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuSex() == null ? other.getuSex() == null : this.getuSex().equals(other.getuSex()))
            && (this.getuAge() == null ? other.getuAge() == null : this.getuAge().equals(other.getuAge()))
            && (this.getuDemand() == null ? other.getuDemand() == null : this.getuDemand().equals(other.getuDemand()))
            && (this.getuVip() == null ? other.getuVip() == null : this.getuVip().equals(other.getuVip()))
            && (this.getuCreatime() == null ? other.getuCreatime() == null : this.getuCreatime().equals(other.getuCreatime()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserinfoId() == null) ? 0 : getUserinfoId().hashCode());
        result = prime * result + ((getuUsername() == null) ? 0 : getuUsername().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuSex() == null) ? 0 : getuSex().hashCode());
        result = prime * result + ((getuAge() == null) ? 0 : getuAge().hashCode());
        result = prime * result + ((getuDemand() == null) ? 0 : getuDemand().hashCode());
        result = prime * result + ((getuVip() == null) ? 0 : getuVip().hashCode());
        result = prime * result + ((getuCreatime() == null) ? 0 : getuCreatime().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfoId=").append(userinfoId);
        sb.append(", uUsername=").append(uUsername);
        sb.append(", uName=").append(uName);
        sb.append(", uSex=").append(uSex);
        sb.append(", uAge=").append(uAge);
        sb.append(", uDemand=").append(uDemand);
        sb.append(", uVip=").append(uVip);
        sb.append(", uCreatime=").append(uCreatime);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}