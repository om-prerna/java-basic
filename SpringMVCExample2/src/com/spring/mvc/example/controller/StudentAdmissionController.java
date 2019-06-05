package com.spring.mvc.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentAdmissionController {

    @RequestMapping("/data/{firstname}/{lastname}")
    public ModelAndView studentData(@PathVariable("firstname") String firstName, @PathVariable("lastname") String lastName){
        ModelAndView md = new ModelAndView("HomePage");
        md.addObject("message","Congratulation "+ firstName + " "+ lastName + " for getting admission into out institute");
        return md;
    }

    @RequestMapping("/admissionform.html")
    public ModelAndView admissionForm(){
        ModelAndView md = new ModelAndView("AdmissionForm");
        md.addObject("formHeader", "Dear Studeent, Kindly fill up the below details!");
        return md;
    }

    /*@RequestMapping(value = "/submitpage.html", method = RequestMethod.POST)
    public ModelAndView submitPage(@RequestParam(value="stName", defaultValue = "Pinnu", required = false) String name, @RequestParam("comName") String companyName){
        ModelAndView md = new ModelAndView("SubmitPage");
        md.addObject("message","Dear "+ name + ", from "+ companyName+ " thanks for submitting the data.");
        return md;
    }*/

   /* @RequestMapping(value = "/submitpage.html", method = RequestMethod.POST)
    public ModelAndView submitPage(@RequestParam(value="stName", defaultValue = "Pinnu", required = false) String name, @RequestParam("comName") String companyName){

       Student student = new Student();
       student.setStName(name);
       student.setComName(companyName);

        ModelAndView md = new ModelAndView("SubmitPage");
        md.addObject("message"," thanks for submitting the data.");
        md.addObject(student);

        return md;
    }
*/
   // same functionality using @ModelAttribute on method argument 1) to provide auto data-binding 2) reduces line of codes
    @RequestMapping(value = "/submitpage.html", method = RequestMethod.POST)
    public ModelAndView submitPage(@ModelAttribute("student") Student student, BindingResult result){

        if(result.hasErrors())
        {
            ModelAndView md1  = new ModelAndView("AdmissionForm");
            return md1;
        }
        ModelAndView md = new ModelAndView("SubmitPage");
        //md.addObject("message"," thanks for submitting the data.");
        return md;
    }

    //using @modelAttribute at a method level
    @ModelAttribute
    public void commonMethodObject(Model md){
        md.addAttribute("message", "ABC College of creativity");
    }
}
