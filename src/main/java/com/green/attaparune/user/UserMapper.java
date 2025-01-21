package com.green.attaparune.user;

import com.green.attaparune.user.model.EmailValidationRes;
import com.green.attaparune.user.model.UserSignInRes;
import com.green.attaparune.user.model.UserSignUpReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //회원가입
    int insUser(UserSignUpReq p);


    UserSignInRes selUserByUid(String uid);
}
