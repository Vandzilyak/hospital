package com.hospital.controller;

import com.hospital.entities.Patient;
import com.hospital.service.PatientService;
import com.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/loginAndRegistration";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(Model model){
        List<Patient> patients = patientService.getAll();
        model.addAttribute("test", patients);
        return "test";
    }

    /*@RequestMapping(value = "/loginAndRegistration", method = RequestMethod.GET)
    public String loginAndRegistration(Model model){
        model.addAttribute("user", new User());
        return "loginAndRegistration";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user,  RedirectAttributes redirectAttributes){

        if(userService.checkUser(user)){
            redirectAttributes.addFlashAttribute("logInUser",user);
            return "redirect:/patients";
        }else {
            return "redirect:/loginAndRegistration";
        }
    }
//         -----------REGISTRATION--------------
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("user") User user){
        userService.checkUser(user);
        userService.addUser(user);
        return "redirect:/patients";
    }



    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public String getAllPatients(Model model, @ModelAttribute("logInUser") User user) {
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);
        return "patients";
    }


    @RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
    public String getPatient(@PathVariable("id") long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "patientProfile";
    }

    @RequestMapping(value = "/addPatient", method = RequestMethod.GET)
    public String addPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "addPatient";
    }

    @RequestMapping(value = "/addPatient", method = RequestMethod.POST)
    public String addPatient(@ModelAttribute("patient") Patient patient) {
        patientService.addPatient(patient);
        return "redirect:patients";
    }

    @RequestMapping(value = "/deletePatient/{id}", method = RequestMethod.GET)
    public String deletePatientById(@PathVariable Long id) {
        patientService.deletePatientById(id);
        return "redirect:/patients";
    }


    @RequestMapping(value = "/updatePatient/{id}", method = RequestMethod.GET)
    public String updatePatient(@PathVariable Long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "patientUpdate";
    }

    @RequestMapping(value = "/updatePatient", method = RequestMethod.POST)
    public String updatePatient(@ModelAttribute("patient") Patient patient) {
        patientService.updatePatient(patient);
        return "redirect:patients";
    }


*/
}