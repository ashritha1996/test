//package com.spring.test.webservice;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class topicService {
//
//    List<topics> topicsList = new ArrayList<>(Arrays.asList(
//            new topics("cyber","1","my course"),
//            new topics("security","2","my current course"),
//            new topics("crypto","3","my mtech course")
//    ));
//
//    public List<topics> getAllTopics(){
//        return topicsList;
//    }
//
//    public topics getTopics(String id){
//        return topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
//    }
//
//    public void addTopics(topics topic){
//        topicsList.add(topic);
//    }
//
//    public boolean puttopic(String id, topics topic){
//        for(int i = 0; i< topicsList.size(); i++) {
//            if(topicsList.get(i).getId().equals(id)){
//                topicsList.set(i, topic);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean deletetopic(String id){
//        for(int i = 0; i< topicsList.size(); i++) {
//            if(topicsList.get(i).getId().equals(id)){
//                topicsList.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
