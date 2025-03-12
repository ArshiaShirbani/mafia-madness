package com.mafiamadness.mafiagame;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class loginController {

     /*@Autowired

    private userRepository userRepository;

   @PostMapping("/login")

    public Map<String, Object> login(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        String password = payload.get("password");

        Optional<user> userOpt = userRepository.findByUsername(username);

        Map<String, Object> response = new HashMap<>();
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {
            response.put("success", true);
        } else {
            response.put("success", false);
            response.put("message", "Invalid credentials");
        }

         return response;
          
    }
         */
}
    

