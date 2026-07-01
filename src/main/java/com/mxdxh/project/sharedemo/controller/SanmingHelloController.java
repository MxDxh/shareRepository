package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SanmingHelloController
 * @Description: 提供你好三明示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/sanming")
public class SanmingHelloController {

    @GetMapping("/hello")
    public String helloSanming() {
        return "你好 三明";
    }
}
