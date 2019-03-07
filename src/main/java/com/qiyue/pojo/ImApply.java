package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_apply")
public class ImApply {
    @Id
    private String id;

    @Column(name = "applicationId")
    private String applicationid;

    @Column(name = "createAt")
    private Date createat;

    private String description;

    @Column(name = "targetId")
    private String targetid;

    private Integer type;

    @Column(name = "updatedAt")
    private Date updatedat;

    private String attach;

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
     * @return applicationId
     */
    public String getApplicationid() {
        return applicationid;
    }

    /**
     * @param applicationid
     */
    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
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
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return targetId
     */
    public String getTargetid() {
        return targetid;
    }

    /**
     * @param targetid
     */
    public void setTargetid(String targetid) {
        this.targetid = targetid;
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
     * @return updatedAt
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * @param updatedat
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
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
}