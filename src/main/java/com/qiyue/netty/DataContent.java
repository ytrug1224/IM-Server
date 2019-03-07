package com.qiyue.netty;

import java.io.Serializable;

public class DataContent implements Serializable {
    private static final long serialVersionUID = 8021381444738260454L;

    private Integer dataType;
    private ChatMessage chatMsg;
    private String extand;

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public ChatMessage getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(ChatMessage chatMsg) {
        this.chatMsg = chatMsg;
    }

    public String getExtand() {
        return extand;
    }

    public void setExtand(String extand) {
        this.extand = extand;
    }
}
