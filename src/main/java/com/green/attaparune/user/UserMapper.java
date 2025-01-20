package com.green.attaparune.user;

import com.green.attaparune.user.model.UserSignInRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserSignInRes selUserByUid(String uid);
}
