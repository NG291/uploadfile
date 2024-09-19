package com.demoformdatabinding.controller;

import com.demoformdatabinding.model.Customer;
import com.demoformdatabinding.model.Upload;
import com.demoformdatabinding.service.UploadFileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class CustomerController {
    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/display");
        Customer customer = new Customer(1L,"nguyen");
       modelAndView.addObject("customer",customer);
       modelAndView.addObject("upload",new Upload());
        return  modelAndView;
    }
    @PostMapping("/upload")
    public ModelAndView upload(Upload upload) throws IOException {
        ModelAndView modelAndView = new ModelAndView("/view");
        UploadFileService uploadFileService = new UploadFileService();
        uploadFileService.uploadFile(upload.getFile());
        return modelAndView;
    }

}
