package com.hqyj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class text {
  @RequestMapping("/text/info")
  @ResponseBody
  public String getInfo() {
	  return "my";
  }
  
  
 
}
