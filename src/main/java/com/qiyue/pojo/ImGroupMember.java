package com.qiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "im_group_member")
public class ImGroupMember {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "GroupID")
    private Integer groupid;

    @Column(name = "MemberID")
    private Integer memberid;

    @Column(name = "MemberName")
    private String membername;

    @Column(name = "Type")
    private Integer type;

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
     * @return GroupID
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * @return MemberID
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * @param memberid
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * @return MemberName
     */
    public String getMembername() {
        return membername;
    }

    /**
     * @param membername
     */
    public void setMembername(String membername) {
        this.membername = membername;
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
}