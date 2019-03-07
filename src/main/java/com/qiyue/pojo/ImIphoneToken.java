package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_iphone_token")
public class ImIphoneToken {
    @Id
    @Column(name = "human_id")
    private Integer humanId;

    @Column(name = "iphone_token")
    private String iphoneToken;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "company_id")
    private Integer companyId;

    /**
     * @return human_id
     */
    public Integer getHumanId() {
        return humanId;
    }

    /**
     * @param humanId
     */
    public void setHumanId(Integer humanId) {
        this.humanId = humanId;
    }

    /**
     * @return iphone_token
     */
    public String getIphoneToken() {
        return iphoneToken;
    }

    /**
     * @param iphoneToken
     */
    public void setIphoneToken(String iphoneToken) {
        this.iphoneToken = iphoneToken;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}