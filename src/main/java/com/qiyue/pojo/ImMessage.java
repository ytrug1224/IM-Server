package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_message")
public class ImMessage {
    @Id
    private String id;

    private String attach;

    @Column(name = "createAt")
    private Date createat;

    @Column(name = "groupId")
    private String groupid;

    @Column(name = "receiverId")
    private String receiverid;

    private Integer type;

    @Column(name = "updateAt")
    private Date updateat;

    @Column(name = "senderId")
    private String senderid;

    private String content;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    /**
     * @param attach
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * @return createAt
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * @param createat
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * @return groupId
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    /**
     * @return receiverId
     */
    public String getReceiverid() {
        return receiverid;
    }

    /**
     * @param receiverid
     */
    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return updateAt
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * @param updateat
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * @return senderId
     */
    public String getSenderid() {
        return senderid;
    }

    /**
     * @param senderid
     */
    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    /**
     * @return content
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
}