package com.qiyue.netty;

import java.io.Serializable;

/**
 * @author zxj
 */
public class DataContent implements Serializable {
    private static final long serialVersionUID = 8021381444738260454L;

    private Integer action;
    private ChatMessage chatMsg;
    private String extend;

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public ChatMessage getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(ChatMessage chatMsg) {
        this.chatMsg = chatMsg;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}
