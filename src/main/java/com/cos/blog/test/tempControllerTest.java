package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tempControllerTest {

    
    //localhost:8000/blog/temp/home
    @GetMapping("/temp/home")
    public String tempHome(){
        return "/home.html";
        //file src : src/main/resorces/static
        //return name : /home.html
    }

    //localhost:8000/blog/temp/img
    @GetMapping("/temp/img")
    public String tempimg(){
        return "/a.jpeg";
    }

    //localhost:8000/blog/temp/jsp
    @GetMapping("/temp/jsp")
    public String tempJSP(){
        return "test";

    }
}
