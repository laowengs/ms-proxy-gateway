package com.laowengs.ms.proxy.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
@Slf4j
public class VersionController {

    @GetMapping
    public String currentVersion(@RequestParam("app_id") String appId){
        log.info("appid currentVersion{}",appId);
        return "";
    }

    @GetMapping("/nextValue")
    public String nextVersion(@RequestParam("app_id") String appId){
        log.info("appid nextValue{}",appId);
        return "";
    }



}
