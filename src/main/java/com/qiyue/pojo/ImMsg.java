package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_msg")
public class ImMsg {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Args")
    private String args;

    @Column(name = "Content")
    private String content;

    @Column(name = "MsgSubType")
    private Integer msgsubtype;

    @Column(name = "MsgType")
    private Integer msgtype;

    @Column(name = "MsgID")
    private String msgid;

    @Column(name = "ReceiveID")
    private Integer receiveid;

    @Column(name = "ReceiveName")
    private String receivename;

    @Column(name = "RelateID")
    private Integer relateid;

    @Column(name = "SendID")
    private Integer sendid;

    @Column(name = "SendName")
    private String sendname;

    @Column(name = "SendTime")
    private Date sendtime;

    @Column(name = "StageID")
    private Integer stageid;

    @Column(name = "StageName")
    private String stagename;

    @Column(name = "TopicID")
    private Integer topicid;

    @Column(name = "CompanyID")
    private Integer companyid;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Args
     */
    public String getArgs() {
        return args;
    }

    /**
     * @param args
     */
    public void setArgs(String args) {
        this.args = args;
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
     * @return MsgSubType
     */
    public Integer getMsgsubtype() {
        return msgsubtype;
    }

    /**
     * @param msgsubtype
     */
    public void setMsgsubtype(Integer msgsubtype) {
        this.msgsubtype = msgsubtype;
    }

    /**
     * @return MsgType
     */
    public Integer getMsgtype() {
        return msgtype;
    }

    /**
     * @param msgtype
     */
    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    /**
     * @return MsgID
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * @param msgid
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    /**
     * @return ReceiveID
     */
    public Integer getReceiveid() {
        return receiveid;
    }

    /**
     * @param receiveid
     */
    public void setReceiveid(Integer receiveid) {
        this.receiveid = receiveid;
    }

    /**
     * @return ReceiveName
     */
    public String getReceivename() {
        return receivename;
    }

    /**
     * @param receivename
     */
    public void setReceivename(String receivename) {
        this.receivename = receivename;
    }

    /**
     * @return RelateID
     */
    public Integer getRelateid() {
        return relateid;
    }

    /**
     * @param relateid
     */
    public void setRelateid(Integer relateid) {
        this.relateid = relateid;
    }

    /**
     * @return SendID
     */
    public Integer getSendid() {
        return sendid;
    }

    /**
     * @param sendid
     */
    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    /**
     * @return SendName
     */
    public String getSendname() {
        return sendname;
    }

    /**
     * @param sendname
     */
    public void setSendname(String sendname) {
        this.sendname = sendname;
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
     * @return StageID
     */
    public Integer getStageid() {
        return stageid;
    }

    /**
     * @param stageid
     */
    public void setStageid(Integer stageid) {
        this.stageid = stageid;
    }

    /**
     * @return StageName
     */
    public String getStagename() {
        return stagename;
    }

    /**
     * @param stagename
     */
    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    /**
     * @return TopicID
     */
    public Integer getTopicid() {
        return topicid;
    }

    /**
     * @param topicid
     */
    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
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
}