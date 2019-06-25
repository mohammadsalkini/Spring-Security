package at.malsalkini.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  24.06.2019
 * Time:  10:25 AM
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }
}
