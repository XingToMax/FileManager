package org.nuaa.tomax.filemanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name: DemoController
 * @Description: TODO
 * @Author: Tomax
 * @Date: 2019-02-08 22:43
 * @Version: 1.0
 */
@RequestMapping("/")
@CrossOrigin
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String say() {
        return "hello";
    }
}
