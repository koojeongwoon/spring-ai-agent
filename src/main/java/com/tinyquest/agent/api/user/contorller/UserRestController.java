package com.tinyquest.agent.api.user.contorller;

import com.tinyquest.agent.api.user.model.request.UserCreateRequest;
import com.tinyquest.agent.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserRestController {

    private final UserService userService;

    @PostMapping
    public String createUser(
            @RequestBody UserCreateRequest req
    ) {
        userService.createUser(req);
        return "OK";
    }

    @GetMapping
    public String getUsers() {
        return "OK11114423";
    }
}
