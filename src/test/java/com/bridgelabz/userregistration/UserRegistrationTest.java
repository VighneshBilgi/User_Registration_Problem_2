package com.bridgelabz.userregistration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("Vighnesh");
        assertEquals("First Name",true,result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("vIGHNESH");
        assertEquals("First Name",false,result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("Bilgi");
        assertEquals("Last Name",true,result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("bILGI");
        assertEquals("Last Name",false,result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("vighnesh@gmail.com");
        assertEquals("Email",true,result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("vighnesh.gmail.com");
        assertEquals("Email",false,result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("9049480396");
        assertEquals("Mobile Number",true,result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("12345");
        assertEquals("Mobile Number",false,result);
    }

//    @Test
//    public void emailSampleValidation() {
//    }
}