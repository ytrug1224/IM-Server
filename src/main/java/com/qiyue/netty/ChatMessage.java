package com.qiyue.netty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zxj
 */
public class ChatMessage implements Serializable {
    private static final long serialVersionUID = 3611169682695799175L;
    /**
     * 发送者的用户id
     */
    private String senderId;
    /**
     * 接受者的用户id
     */
    private String receiverId;
    /**
     * 聊天内容
     */
    private String msg;
    /**
     * 用于消息的签收
     */
    private String msgId;
    /**
     * 消息发送或接受的时间
     */
    private LocalDateTime msgTime = LocalDateTime.now();

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public LocalDateTime getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(LocalDateTime msgTime) {
        this.msgTime = msgTime;
    }
}
