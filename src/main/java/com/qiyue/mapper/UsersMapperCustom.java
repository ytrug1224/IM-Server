package com.qiyue.mapper;

import com.qiyue.pojo.Users;
import com.qiyue.pojo.vo.FriendRequestVO;
import com.qiyue.pojo.vo.MyFriendsVO;
import com.qiyue.utils.MyMapper;

import java.util.List;

/**
 * @author Administrator
 */
public interface UsersMapperCustom extends MyMapper<Users> {

    List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

    List<MyFriendsVO> queryMyFriends(String userId);

    void batchUpdateMsgSigned(List<String> msgIdList);

}