package com.dqgjk.mvc.controller;

import com.dqgjk.domain.Area;
import com.dqgjk.domain.Guser;
import com.dqgjk.domain.ResponseObj;
import com.dqgjk.service.JedisService;
import com.dqgjk.service.UserService;
import com.dqgjk.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/loginAction")
public class LoginController {

    @Autowired
    private JedisService jedisService;
    @Autowired
    private UserService userService;    //自动载入Service对象
    private ResponseObj responseObj;

    @RequestMapping(value = "/signIn"
            , method = RequestMethod.POST
            , produces = "application/json; charset=utf-8")
    @ResponseBody
    public Object signIn(String account, String pwd) {
        Object result;
        responseObj = new ResponseObj<Guser>();
        Guser guser = userService.findByAccountAndPwd(account, pwd);

        List<Area> province = (List<Area>) jedisService.get("Province");

        responseObj.setCode(ResponseObj.FAILED);
        responseObj.setMsg("用户信息不能为空！");
        result = new GsonUtils().toJson(responseObj);
        return result;
    }


}
