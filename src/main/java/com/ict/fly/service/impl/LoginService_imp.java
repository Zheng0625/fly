package com.ict.fly.service.impl;

import com.ict.fly.dao.FUserinfoMapper;
import com.ict.fly.domain.entity.FUserinfo;
import com.ict.fly.domain.entity.FUserinfoExample;
import com.ict.fly.domain.input.LoginInput;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zyb
 * @date 2019/1/21 0021 - 16:00
 */
@Service("loginService")
public class LoginService_imp implements LoginService {

    @Resource
    private FUserinfoMapper fUserinfoMapper;

    @Override
    public Result Login(LoginInput loginInput) {
        Result result = new Result();

        FUserinfoExample fUserinfoExample = new FUserinfoExample();
        FUserinfoExample.Criteria criteria = fUserinfoExample.createCriteria();

        criteria.andUUsernameEqualTo(loginInput.getUsername());

        List<FUserinfo> fUserinfos = fUserinfoMapper.selectByExampleWithBLOBs(fUserinfoExample);
        if (fUserinfos.size() == 1) {
            FUserinfo fUserinfo = fUserinfos.get(0);
            if (fUserinfo.getuPassword().equals(loginInput.getPassword())) {
                result.setStatus(0);
                result.setMsg("登录成功");
                result.setData(fUserinfo);
            } else {
                result.setStatus(-1);
                result.setMsg("密码错误，请重新输入");
            }
        } else if (fUserinfos.size() > 1) {
            result.setStatus(-1);
            result.setMsg("数据错误，请联系管理员");
        } else {
            result.setStatus(-1);
            result.setMsg("用户不存在，请前往注册");
        }
        return result;


    }


}
