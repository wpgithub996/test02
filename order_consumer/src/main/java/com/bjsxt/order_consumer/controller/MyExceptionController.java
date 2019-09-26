package com.bjsxt.order_consumer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ControllerAdvice
public class MyExceptionController {

    @RequestMapping
    @ExceptionHandler(Exception.class)
   // @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    public String except(Exception e){
        return "error";
//        return "";
    }

}
