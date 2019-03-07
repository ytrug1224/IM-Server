package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_group")
public class ImGroup {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CreateID")
    private Integer createid;

    @Column(name = "DeleteFlag")
    private Integer deleteflag;

    @Column(name = "GroupInfo")
    private String groupinfo;

    @Column(name = "Name")
    private String name;

    @Column(name = "RelateID")
    private Integer relateid;

    @Column(name = "Type")
    private Integer type;

    @Column(name = "UpdateTime")
    private Date updatetime;

    @Column(name = "ValidFlag")
    private Integer validflag;

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
     * @return CreateID
     */
    public Integer getCreateid() {
        return createid;
    }

    /**
     * @param createid
     */
    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    /**
     * @return DeleteFlag
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * @param deleteflag
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * @return GroupInfo
     */
    public String getGroupinfo() {
        return groupinfo;
    }

    /**
     * @param groupinfo
     */
    public void setGroupinfo(String groupinfo) {
        this.groupinfo = groupinfo;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return Type
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
     * @return ValidFlag
     */
    public Integer getValidflag() {
        return validflag;
    }

    /**
     * @param validflag
     */
    public void setValidflag(Integer validflag) {
        this.validflag = validflag;
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