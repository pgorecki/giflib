package com.pgorecki.giflib.controller;

import com.pgorecki.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("robot2", LocalDate.of(2015, 2, 13), "John Doe", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
