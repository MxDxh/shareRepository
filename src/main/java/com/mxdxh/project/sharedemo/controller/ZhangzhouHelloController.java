package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ZhangzhouHelloController
 * @Description: 提供你好漳州示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/zhangzhou")
public class ZhangzhouHelloController {

    @GetMapping("/hello")
    public String helloZhangzhou() {
        return "你好 漳州";
    }
}
