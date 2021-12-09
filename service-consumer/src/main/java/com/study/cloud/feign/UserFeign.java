package com.study.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "SERVICE-PROVIDER")
public interface UserFeign {

    @GetMapping("/users")
    String userList();
}
