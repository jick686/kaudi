package com.puboot.module.admin.controller;

import com.puboot.common.util.CoreConst;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台SQL监控  点击按钮跳转到SQL.HTML页面
 *
 * @author Linzhaoguan
 * @version V1.0
 * @date 2019年9月11日
 */
@Controller
@RequestMapping("/database")
public class DatabaseController {
    @GetMapping(value = "/monitoring")
    public ModelAndView databaseMonitoring() {
        return new ModelAndView(CoreConst.ADMIN_PREFIX + "database/monitoring");
    }
}
