package com.example.demo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
 @Secured("ROLE_GUEST")
    @RequestMapping("/lists")
    public String list()
    {
        return "list";
    }
    @Secured("ROLL_USER")
    @RequestMapping("/draft")
        public String draft()
        {
            return "draft";
        }
    @Secured("ROLL_ADMIN")
    @RequestMapping("/add")
    public String add_posts()
    {
           return "add_post";
    }
}
