package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_topic")
public class ImTopic {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Content")
    private String content;

    @Column(name = "ContentSub")
    private String contentsub;

    @Column(name = "CreateID")
    private Integer createid;

    @Column(name = "CreateName")
    private String createname;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "DeleteFlag")
    private Integer deleteflag;

    @Column(name = "Description")
    private String description;

    @Column(name = "ImgLoadPath")
    private String imgloadpath;

    @Column(name = "IsShowMenu")
    private Integer isshowmenu;

    @Column(name = "Name")
    private String name;

    @Column(name = "PkgName")
    private String pkgname;

    @Column(name = "RelateContent")
    private String relatecontent;

    @Column(name = "RelateID")
    private Integer relateid;

    @Column(name = "Title")
    private String title;

    @Column(name = "Type")
    private Integer type;

    @Column(name = "UpdateTime")
    private String updatetime;

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
     * @return ContentSub
     */
    public String getContentsub() {
        return contentsub;
    }

    /**
     * @param contentsub
     */
    public void setContentsub(String contentsub) {
        this.contentsub = contentsub;
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
     * @return CreateName
     */
    public String getCreatename() {
        return createname;
    }

    /**
     * @param createname
     */
    public void setCreatename(String createname) {
        this.createname = createname;
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
     * @return Description
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
     * @return ImgLoadPath
     */
    public String getImgloadpath() {
        return imgloadpath;
    }

    /**
     * @param imgloadpath
     */
    public void setImgloadpath(String imgloadpath) {
        this.imgloadpath = imgloadpath;
    }

    /**
     * @return IsShowMenu
     */
    public Integer getIsshowmenu() {
        return isshowmenu;
    }

    /**
     * @param isshowmenu
     */
    public void setIsshowmenu(Integer isshowmenu) {
        this.isshowmenu = isshowmenu;
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
     * @return PkgName
     */
    public String getPkgname() {
        return pkgname;
    }

    /**
     * @param pkgname
     */
    public void setPkgname(String pkgname) {
        this.pkgname = pkgname;
    }

    /**
     * @return RelateContent
     */
    public String getRelatecontent() {
        return relatecontent;
    }

    /**
     * @param relatecontent
     */
    public void setRelatecontent(String relatecontent) {
        this.relatecontent = relatecontent;
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
     * @return Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
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