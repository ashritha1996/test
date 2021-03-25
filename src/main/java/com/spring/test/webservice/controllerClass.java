//package com.spring.test.webservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class controllerClass {
//
//    @RequestMapping("/hello")
//    public static String helloCall(){
//        return "Hello World";
//    }
//
//    @Autowired
//    private topicService topicService;
//
//    @RequestMapping("/topics")
//    public List<topics> topics(){
//        return topicService.getAllTopics();
//    }
//
//    @RequestMapping("/topics/{id}")
//    public topics gettopic(@PathVariable String id){
//        return topicService.getTopics(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/topics")
//    public void addtopic(@RequestBody topics topicname){
//        topicService.addTopics(topicname);
//    }
//    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//    public boolean puttopic(@RequestBody topics topicname, @PathVariable String id){
//        return topicService.puttopic(id, topicname);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
//    public boolean deletetopic(@PathVariable String id){
//        return topicService.deletetopic(id);
//    }
//
//
//}
