package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: NingdeHelloController
 * @Description: 提供你好宁德示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/ningde")
public class NingdeHelloController {

    @GetMapping("/hello")
    public String helloNingde() {
        return "你好 宁德";
    }
}
