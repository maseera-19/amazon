package com.testCases;



import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.util.*;
import com.pages.LoginPage;


public class Login {
	LoginPage lp = new LoginPage();

	
	
    @Test
    public void signin() {
    	
       lp.signIn();
       
      
    }

   
    @AfterTest
    public void tearDown() {
        // Close the browser
    	DriverUtils.closeDriver();
    }
}