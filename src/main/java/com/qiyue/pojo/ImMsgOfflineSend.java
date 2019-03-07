package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "im_msg_offline_send")
public class ImMsgOfflineSend {
    @Id
    @Column(name = "MsgSendID")
    private Integer msgsendid;

    @Column(name = "HumanID")
    private Integer humanid;

    @Column(name = "HumanName")
    private String humanname;

    @Column(name = "MsgID")
    private String msgid;

    @Column(name = "SendCount")
    private Integer sendcount;

    @Column(name = "MsgOfflineID")
    private Integer msgofflineid;

    /**
     * @return MsgSendID
     */
    public Integer getMsgsendid() {
        return msgsendid;
    }

    /**
     * @param msgsendid
     */
    public void setMsgsendid(Integer msgsendid) {
        this.msgsendid = msgsendid;
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
     * @return HumanName
     */
    public String getHumanname() {
        return humanname;
    }

    /**
     * @param humanname
     */
    public void setHumanname(String humanname) {
        this.humanname = humanname;
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
     * @return MsgOfflineID
     */
    public Integer getMsgofflineid() {
        return msgofflineid;
    }

    /**
     * @param msgofflineid
     */
    public void setMsgofflineid(Integer msgofflineid) {
        this.msgofflineid = msgofflineid;
    }
}