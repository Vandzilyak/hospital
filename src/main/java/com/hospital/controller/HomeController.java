package com.hospital.controller;

import com.hospital.entities.Patient;
import com.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PatientService patientService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/patients";
    }

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public String getAllPatients(Model model) {
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);
        return "patients";
    }


    @RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
    public String getPatient(@PathVariable("id") long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "patients";
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

}