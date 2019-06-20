package com.example.wbdvsu19Qinserverjava.controller;

import com.example.wbdvsu19Qinserverjava.models.Course;
import com.example.wbdvsu19Qinserverjava.models.Module;
import com.example.wbdvsu19Qinserverjava.repositories.CourseRepository;
import com.example.wbdvsu19Qinserverjava.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ModuleCotroller {
    @Autowired
    ModuleRepository moduleRepository;

    @Autowired
    CourseRepository courseRepository;

    // POST - Creating
    @PostMapping("/api/courses/{cid}/modules")
    public List<Module> createModuleForCourse(@RequestBody Module module, @PathVariable("cid") Integer cid) {
        Course c= courseRepository.findCourseById(cid);
        module.setCourse(c);
        moduleRepository.save(module);
        return moduleRepository.findAllModulesForCourse(cid);
    }

    // GET - Reading
    @GetMapping("/api/modules")
    public List<Module> findAllModules() {
        return moduleRepository.findAllModule();
    }

    @GetMapping("/api/modules/{cid}")
    public Module findModuleById(@PathVariable("id") Integer id) {
        return moduleRepository.findModuleById(id);
    }

    @GetMapping("/api/courses/{cid}/modules")
    public List<Module> findModuleByCourseId(@PathVariable("cid") Integer cid){
        return moduleRepository.findAllModulesForCourse(cid);
    }

    // UPDATE - Updating
    @PutMapping("/api/modules/{id}")
    public Integer updateModule(@PathVariable("id") Integer id, @RequestBody Module module) {
        Module m = moduleRepository.findById(id).get();
        m.set(module);
        moduleRepository.save(m);
        return m.getCourse().getId();
    }


    // DELETE - Deleting
    @DeleteMapping("/api/modules/{id}")
    public void deleteModule(@PathVariable("id") Integer id){
        moduleRepository.deleteById(id);
    }
}
