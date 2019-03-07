package com.qiyue.controller;

import com.qiyue.pojo.Users;
import com.qiyue.utils.JSONResultInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxj
 * 消息处理功能
 */
@RestController
@RequestMapping("imMsg")
public class MessageController {

    @PostMapping("/getGroupMessage")
    public JSONResultInfo getGroupMessage(@RequestBody Users user) throws Exception {
        return null;
    }


}
