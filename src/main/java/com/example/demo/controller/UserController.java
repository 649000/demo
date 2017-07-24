package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
/**
 * Created by Nazri on 13/7/17.
 */

// This means that this class is a Controller
@Controller

//This is a controller.

// This means URL's start with /demo (after Application path)
@RequestMapping(path="/user")
public class UserController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping(path="/create") // Map ONLY GET Requests
    // 'name' and 'email' must match the query string, order doesn't matter
    public @ResponseBody String createUser (@RequestParam String name, @RequestParam String email) {

        //http://localhost/add?name=xxx&email=xxx

        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);

        userRepository.save(n);

        //TODO
        // Return success message in JSON.
        return "Saved";
    }


    @GetMapping(path="/retrieve")
    // Map ONLY GET Requests
    //'name' and 'email' must match the query string, order doesn't matter
    public @ResponseBody String retrieveUser (@RequestParam String name, @RequestParam String email) {
        Gson gson = new Gson();
        // This method takes ID. Need to search for ID first to delete.
        // userRepository.findOne();

//        String json = gson.toJson(userRepository.findAll());


        return "Saved";
    }


    @GetMapping(path="/update") // Map ONLY GET Requests
    // 'name' and 'email' must match the query string, order doesn't matter
    public @ResponseBody String updateUser (@RequestParam String name, @RequestParam String email) {
        // Find and save

        Iterable<User> userList = userRepository.findAll();

        for(int i = 0; i < 10; i++) {
            System.out.print("value of x : " + i );
            System.out.print("\n");
        }

        User n = new User();
        n.setName(name);
        n.setEmail(email);

        userRepository.save(n);

        return "Saved";
    }

    @GetMapping(path="/delete") // Map ONLY GET Requests
    // 'name' and 'email' must match the query string, order doesn't matter
    public @ResponseBody String deleteUser (@RequestParam int id) {

        Long l = new Long(id);
        userRepository.delete(l);
        return "Saved";
    }

    @GetMapping(path="/list")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/list2")
    public @ResponseBody String getAllUsers2() {
        // This returns a JSON or XML with the users
        Gson gson = new Gson();
        String json = gson.toJson(userRepository.findAll());
        return json;
    }
}