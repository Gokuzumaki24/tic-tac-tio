package com.javaProjrct.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/game")
    public String gamePage() {
        return "index"; // Returns the "index.html" file from the templates directory
    }
}
