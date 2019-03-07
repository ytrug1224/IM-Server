package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Message {
    @Id
    @Column(name = "MessageID")
    private Integer messageid;

    @Column(name = "SendHumanID")
    private Integer sendhumanid;

    @Column(name = "SendTime")
    private Date sendtime;

    @Column(name = "Content")
    private String content;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "Status")
    private Integer status;

    @Column(name = "CompanyID")
    private Integer companyid;

    @Column(name = "ReceivePhones")
    private String receivephones;

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
     * @return SendHumanID
     */
    public Integer getSendhumanid() {
        return sendhumanid;
    }

    /**
     * @param sendhumanid
     */
    public void setSendhumanid(Integer sendhumanid) {
        this.sendhumanid = sendhumanid;
    }

    /**
     * @return SendTime
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * @param sendtime
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * @return Content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return CompanyID
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * @param companyid
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * @return ReceivePhones
     */
    public String getReceivephones() {
        return receivephones;
    }

    /**
     * @param receivephones
     */
    public void setReceivephones(String receivephones) {
        this.receivephones = receivephones;
    }
}