package com.nit.springboot_nit_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flipkart")//baseurl:http://localhost:8080/flipkart/test
public class homeController 


{
@RequestMapping("/test")//http://localhost:8080/test
public String test() 
{
	return "This is test";	
	}
@RequestMapping(value={"/test1","/test3"})//multiple handling 
public String test1() 
{
return "This is test1";
}
@RequestMapping("/test2")
public String test2() 
{
return "This is test2";	
}
@RequestMapping("/hellotest")
public String hello()
{
	return "this is branch test";
}

}
