package org.launchcode.skillstracker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class SkillController {
    @GetMapping
    public String GetSkill(){
        return "<html>" +
                "<body>" +
                "<h1> 'Skills Tracker' </h1>" +
                "<h2> 'We have a few skills we would like to learn.Here is the list!' </h2>" +
                "<ol>"+
                "<li> 1.Java </li>"+
                "<li> 2.JavaScript</li>"+
                "<li> 3.Python </li>"+
                "</ol>" +
                "</body>" +
                "</html>";

    }
    @GetMapping("/form")
    public String FormSkills(){
        return "<html>" +
                "<body>" +
                "<form action = '/formpost' method = 'post'>" +
                " <h4> Name: </h4>"+
                "<input type = 'text' name = 'name'>" +
                "<h4>My Favorite Language:</h4>"+
                "<select name = 'mfl'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                 "</select>" +
                " <h4>My Second Favorite Language:</h4>"+
                "<select name = 'mfsl'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" +
                " <h4>My Third Favorite Language:</h4>"+
                "<select name = 'mftl'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" +
                "<br><input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
    @PostMapping(value = "/formpost")
    public String formPost(@RequestParam String name,@RequestParam String mfl, @RequestParam String mfsl, @RequestParam String mftl){
        if(name == null){
            name = "Null";
        }
        System.out.println(name + mfl + mfsl + mftl);
         return favoriteLanguage(name,mfl);

    }
    public static String favoriteLanguage(String n, String l){
        String language ="";

        if (l.equals("java")) {
            language = "Java";
        }
        else if (l.equals("javascript")) {
            language = "JavaScript";
        }
        else if (l.equals("python")) {
            language = "Python";
        }

        return language + " " + n;

    }

}
