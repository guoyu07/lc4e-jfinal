package com.teddy.lc4e.core.web.controller;

import com.teddy.jfinal.annotation.Controller;
import com.teddy.jfinal.interfaces.BaseController;
import org.apache.shiro.authz.annotation.RequiresUser;

/**
 * Created by teddy on 2015/8/7.
 */
@Controller("/testV")
public class testViewController extends BaseController {

    public void index() {
        renderText("xxxxxx");
    }

    public void test() {
        renderText("asdadsa");
    }

    @RequiresUser
    public void aa() {
        renderText("success");
    }
}