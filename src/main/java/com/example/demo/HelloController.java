package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-03-29
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hi(){
        return LocalDateTime.now().toString();
    }

}
