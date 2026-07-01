package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: QuanzhouHelloController
 * @Description: 提供你好泉州示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/quanzhou")
public class QuanzhouHelloController {

    @GetMapping("/hello")
    public String helloQuanzhou() {
        return "你好 泉州";
    }
}
