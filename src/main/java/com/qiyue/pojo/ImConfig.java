package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "im_config")
public class ImConfig {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DisplayName")
    private String displayname;

    @Column(name = "Name")
    private String name;

    @Column(name = "Value")
    private String value;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "DisplayOrder")
    private Integer displayorder;

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
     * @return DisplayName
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * @param displayname
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
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
     * @return Value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return Remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return DisplayOrder
     */
    public Integer getDisplayorder() {
        return displayorder;
    }

    /**
     * @param displayorder
     */
    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }
}