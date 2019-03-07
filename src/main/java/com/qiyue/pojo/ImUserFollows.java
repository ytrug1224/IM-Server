package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_user_follows")
public class ImUserFollows {
    @Id
    private String id;

    private String alias;

    @Column(name = "createDate")
    private Date createdate;

    @Column(name = "originId")
    private String originid;

    @Column(name = "targetId")
    private String targetid;

    @Column(name = "updateDate")
    private Date updatedate;

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
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return originId
     */
    public String getOriginid() {
        return originid;
    }

    /**
     * @param originid
     */
    public void setOriginid(String originid) {
        this.originid = originid;
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
     * @return updateDate
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}