package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_push_history")
public class ImPushHistory {
    @Id
    private String id;

    @Column(name = "arrivalAt")
    private Date arrivalat;

    @Column(name = "createdAt")
    private Date createdat;

    @Column(name = "entityType")
    private Integer entitytype;

    @Column(name = "receiverId")
    private String receiverid;

    @Column(name = "receiverPushId")
    private String receiverpushid;

    @Column(name = "senderId")
    private String senderid;

    @Column(name = "updateAt")
    private Date updateat;

    private byte[] entity;

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
     * @return arrivalAt
     */
    public Date getArrivalat() {
        return arrivalat;
    }

    /**
     * @param arrivalat
     */
    public void setArrivalat(Date arrivalat) {
        this.arrivalat = arrivalat;
    }

    /**
     * @return createdAt
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * @param createdat
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * @return entityType
     */
    public Integer getEntitytype() {
        return entitytype;
    }

    /**
     * @param entitytype
     */
    public void setEntitytype(Integer entitytype) {
        this.entitytype = entitytype;
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
     * @return receiverPushId
     */
    public String getReceiverpushid() {
        return receiverpushid;
    }

    /**
     * @param receiverpushid
     */
    public void setReceiverpushid(String receiverpushid) {
        this.receiverpushid = receiverpushid;
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
     * @return entity
     */
    public byte[] getEntity() {
        return entity;
    }

    /**
     * @param entity
     */
    public void setEntity(byte[] entity) {
        this.entity = entity;
    }
}