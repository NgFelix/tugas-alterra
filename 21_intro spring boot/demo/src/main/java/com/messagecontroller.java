package com.alterraintrospringboot.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/messages")
public class messageController {
    @GetMapping
    public modelMessage getMessage(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSuccess(true);
        mMessage.setMessage("Success");
        mMessage.setData("Hello World");

        return mMessage;
    }
    @DeleteMapping
    public modelMessage deleteMessage(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSuccess(true);
        mMessage.setMessage("Success");
        mMessage.setData("Hello World");

        return mMessage;
    }
    @PostMapping
    public modelMessage postMessase(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSuccess(true);
        mMessage.setMessage("Success");
        mMessage.setData("Hello World");

        return mMessage;
    }


}