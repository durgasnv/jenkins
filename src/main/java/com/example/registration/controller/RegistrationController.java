package com.example.registration.controller;

import com.example.registration.model.Registration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @PostMapping
    public String register(@RequestBody Registration user) {

        return "Registration Successful!\n\n"
                + "Name : " + user.getFullName()
                + "\nAge : " + user.getAge()
                + "\nGender : " + user.getGender()
                + "\nEmail : " + user.getEmail()
                + "\nPhone : " + user.getPhoneNumber()
                + "\nCollege : " + user.getCollegeName()
                + "\nDepartment : " + user.getDepartment()
                + "\nYear : " + user.getYearOfStudy()
                + "\nEvent : " + user.getEventName()
                + "\nAddress : " + user.getAddress()
                + "\nCity : " + user.getCity()
                + "\nState : " + user.getState();
    }
}