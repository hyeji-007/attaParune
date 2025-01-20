package com.green.attaparune.user;

import com.green.attaparune.user.model.UserSignInReq;
import com.green.attaparune.user.model.UserSignInRes;
import org.mindrot.jbcrypt.BCrypt;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public UserSignInRes signIn(UserSignInReq p) {
        UserSignInRes res = userMapper.selUserByUid(p.getUid());

        if(res == null) {
            res = new UserSignInRes();
            res.setMessage("아이디를 확인해 주세요.");
        } else if(!BCrypt.checkpw(p.getUpw(),res.getUpw())) {
            res = new UserSignInRes();
            res.setMessage("비밀번호를 확인해 주세요.");
        } else {
            res.setMessage("로그인 성공");
        }

        return res;
    }
}
