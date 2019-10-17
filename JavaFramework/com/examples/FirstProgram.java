package com.examples;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
	
	static ArrayList<Person> personList = new ArrayList<Person>();
	
	
	public static void main(String[] args) throws InterruptedException {

		
		 System.out.println(System.getProperty("user.dir")+"/com/resources/drivers/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/com/resources/drivers/chromedriver.exe");  
		  Thread.sleep(5000);

		  
//		
//		driver.get("https://www.adactin.com/");
//		driver.quit();
		
		personList.add(new Person("Jomy",33,"Male"));
		personList.add(new Person("Vijish",32,"Male"));
		
		for(Person person : personList) {
			System.out.println("Name : "+person.getName()+"\nAge : "+person.getAge());
			System.out.println(person.toString());
		}
		
		
	}

}
