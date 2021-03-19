package com.nitin.restfulwebservices.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: nitinkumar
 * Created Date: 19/03/21
 * Info: Simple version of controller and methods mapped to http requests. The class should be in same or sub-package of RestfulWebServicesApplication class.
 **/
@RestController
public class SampleController {

    //@RequestMapping(method = RequestMethod.GET,path = "/sample")
    @GetMapping(path = "/sample")
    public String sampleGetRequestMethod() {
        return "hello world";
    }

    @GetMapping(path = "/sample-bean")
    public SampleMessageBean sampleGetMethodReturningBean() {
        return new SampleMessageBean("hello world!");
    }

}
