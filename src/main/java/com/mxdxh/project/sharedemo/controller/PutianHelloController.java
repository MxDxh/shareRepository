package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PutianHelloController
 * @Description: 提供你好莆田示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/putian")
public class PutianHelloController {

    @GetMapping("/hello")
    public String helloPutian() {
        return "你好 莆田";
    }
}
