package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_msg_offline")
public class ImMsgOffline {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "HumanID")
    private Integer humanid;

    @Column(name = "MsgID")
    private String msgid;

    @Column(name = "MsgSubType")
    private Integer msgsubtype;

    @Column(name = "MsgType")
    private Integer msgtype;

    @Column(name = "PacketType")
    private Integer packettype;

    @Column(name = "SendType")
    private Integer sendtype;

    @Column(name = "SendCount")
    private Integer sendcount;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "CompanyID")
    private Integer companyid;

    @Column(name = "RelateID")
    private Integer relateid;

    @Column(name = "EgovaMsgType")
    private Integer egovamsgtype;

    @Column(name = "Msg")
    private String msg;

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
     * @return HumanID
     */
    public Integer getHumanid() {
        return humanid;
    }

    /**
     * @param humanid
     */
    public void setHumanid(Integer humanid) {
        this.humanid = humanid;
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
     * @return PacketType
     */
    public Integer getPackettype() {
        return packettype;
    }

    /**
     * @param packettype
     */
    public void setPackettype(Integer packettype) {
        this.packettype = packettype;
    }

    /**
     * @return SendType
     */
    public Integer getSendtype() {
        return sendtype;
    }

    /**
     * @param sendtype
     */
    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    /**
     * @return SendCount
     */
    public Integer getSendcount() {
        return sendcount;
    }

    /**
     * @param sendcount
     */
    public void setSendcount(Integer sendcount) {
        this.sendcount = sendcount;
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
     * @return EgovaMsgType
     */
    public Integer getEgovamsgtype() {
        return egovamsgtype;
    }

    /**
     * @param egovamsgtype
     */
    public void setEgovamsgtype(Integer egovamsgtype) {
        this.egovamsgtype = egovamsgtype;
    }

    /**
     * @return Msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}