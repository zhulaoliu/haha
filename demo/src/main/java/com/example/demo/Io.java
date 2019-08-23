package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Io {
	@RequestMapping("/upload.do")
      public void upload( String text) throws Exception {

    	System.out.println(text);

    		
    		

    	 
    	  
      }
	
	
}
