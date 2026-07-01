package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LongyanHelloController
 * @Description: 提供你好龙岩示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/longyan")
public class LongyanHelloController {

    @GetMapping("/hello")
    public String helloLongyan() {
        return "你好 龙岩";
    }
}
