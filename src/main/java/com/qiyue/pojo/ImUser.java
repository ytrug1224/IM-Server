package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "im_user")
public class ImUser {
    @Id
    private String id;

    @Column(name = "createDate")
    private Date createdate;

    private String description;

    @Column(name = "lastReceivedDate")
    private Date lastreceiveddate;

    private String name;

    @Column(name = "nikeName")
    private String nikename;

    private String password;

    private String phone;

    private String avatar;

    @Column(name = "pushId")
    private String pushid;

    private Integer gender;

    private String token;

    @Column(name = "updateTime")
    private Date updatetime;

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
     * @return lastReceivedDate
     */
    public Date getLastreceiveddate() {
        return lastreceiveddate;
    }

    /**
     * @param lastreceiveddate
     */
    public void setLastreceiveddate(Date lastreceiveddate) {
        this.lastreceiveddate = lastreceiveddate;
    }

    /**
     * @return name
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
     * @return nikeName
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * @param nikename
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return pushId
     */
    public String getPushid() {
        return pushid;
    }

    /**
     * @param pushid
     */
    public void setPushid(String pushid) {
        this.pushid = pushid;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return updateTime
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
}