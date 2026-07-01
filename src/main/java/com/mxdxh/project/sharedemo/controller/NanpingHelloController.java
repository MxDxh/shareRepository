package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: NanpingHelloController
 * @Description: 提供你好南平示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/nanping")
public class NanpingHelloController {

    @GetMapping("/hello")
    public String helloNanping() {
        return "你好 南平";
    }
}
