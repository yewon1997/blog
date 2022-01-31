package com.cos.blog.test;


import org.springframework.web.bind.annotation.*;

@RestController
//user request -> response (data)
//user request -> response (htmp) : Controller

public class HttpControllerTest {

    //인터넷 브라우저 요청은 get만
    //http://localhost:8080/http/get
    @GetMapping("/http/get")
    /*
    public String getTest(@RequestParam int id,@RequestParam string username ) {
        return "get " + id +","+ username;
    }*/
    public String getTest( Member m ) {
        return "get  " + m.getId() +","+ m.getUsername()+","+m.getEmail();
    }


    /*
    @PostMapping("/http/post")
    public String postTest(Member m) {
        return "post  " + m.getId() +","+ m.getUsername()+","+m.getEmail();
    }
    */
    /*
    @PostMapping("/http/post")
    public String postTest(@RequestBody  String text) {
        return "post "+ text;
    }
    */

    //JSON file
    @PostMapping("/http/post")
    public String postTest(@RequestBody  Member m) { // MessageConverter(springboot)
        return "post  " + m.getId() +","+ m.getUsername()+","+m.getEmail();
    }


    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m) {
        return "put  " + m.getId() +","+ m.getUsername()+","+m.getEmail();
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete";
    }

}
