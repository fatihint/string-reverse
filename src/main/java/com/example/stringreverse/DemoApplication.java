package com.example.stringreverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	@ResponseBody
	String home(@RequestParam(value = "input") String param) {
	    if (param == null)
	        return "Please provide a parameter named `input` in url...";
		return stringReverse(param);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public String stringReverse(String param) {

	    char[] strToChar = param.toCharArray();
	    char[] charToStr = new char[strToChar.length];

	    for (int i = strToChar.length - 1; i >= 0; i++ ) {
	        charToStr[i] = strToChar[i];
        }

        return charToStr.toString();

    }
}
