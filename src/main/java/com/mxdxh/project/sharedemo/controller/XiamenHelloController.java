package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: XiamenHelloController
 * @Description: 提供 你好厦门 示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/xiamen")
public class XiamenHelloController {

    @GetMapping("/hello")
    public String helloXiamen() {
        return "你好 厦门";
    }
}
