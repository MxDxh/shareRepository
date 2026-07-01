package com.mxdxh.project.sharedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: EarthHelloController
 * @Description: 提供 Hello 地球 示例接口
 * @Author: pyh
 * @Date: 2026-07-01
 * @Version: 1.0
 */
@RestController
@RequestMapping("/earth")
public class EarthHelloController {

    @GetMapping("/hello")
    public String helloEarth() {
        return "Hello 地球";
    }
}
