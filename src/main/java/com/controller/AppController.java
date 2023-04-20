package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.repository.StudentRepository;

@Controller
public class AppController {

    @Autowired
    StudentRepository repository;

    @RequestMapping("/")
    public String viewHome(Model model){
        //List<Student> listStudent = service.listAll();
        List<Student> listStudent = repository.findAll();
        model.addAttribute("listStudent", listStudent);
        return "index";
        
    }
    @GetMapping(path = "/new_student")
    public String newStudent(Model model){
        Student student = new Student();
        model.addAttribute("student" ,student);
        return "new_student";
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student){
        repository.save(student);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable (name="id") Long id) {
		ModelAndView mav=new ModelAndView("edit_student");
		Student student=repository.findById(id).get();
		mav.addObject("student",student);
		return mav;
    }
        @RequestMapping("delete/{id}")
	    public String deleteStudentPage(@PathVariable (name="id") Long id) {
        repository.deleteById(id);
		return "redirect:/";
	}
	

}
