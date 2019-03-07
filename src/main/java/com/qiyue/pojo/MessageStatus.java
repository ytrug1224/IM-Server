package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "message_status")
public class MessageStatus {
    @Id
    @Column(name = "MessageStatusID")
    private Integer messagestatusid;

    @Column(name = "MessageID")
    private Integer messageid;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "MobileIDs")
    private String mobileids;

    @Column(name = "Status")
    private String status;

    @Column(name = "Gateway")
    private String gateway;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "UpdateTime")
    private Date updatetime;

    @Column(name = "RepeatTime")
    private Integer repeattime;

    /**
     * @return MessageStatusID
     */
    public Integer getMessagestatusid() {
        return messagestatusid;
    }

    /**
     * @param messagestatusid
     */
    public void setMessagestatusid(Integer messagestatusid) {
        this.messagestatusid = messagestatusid;
    }

    /**
     * @return MessageID
     */
    public Integer getMessageid() {
        return messageid;
    }

    /**
     * @param messageid
     */
    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    /**
     * @return Mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return MobileIDs
     */
    public String getMobileids() {
        return mobileids;
    }

    /**
     * @param mobileids
     */
    public void setMobileids(String mobileids) {
        this.mobileids = mobileids;
    }

    /**
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return Gateway
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * @param gateway
     */
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * @return CreateTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return UpdateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return RepeatTime
     */
    public Integer getRepeattime() {
        return repeattime;
    }

    /**
     * @param repeattime
     */
    public void setRepeattime(Integer repeattime) {
        this.repeattime = repeattime;
    }
}