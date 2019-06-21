package com.example.wbdvsu19Qinserverjava.controller;

import java.util.List;

import com.example.wbdvsu19Qinserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.wbdvsu19Qinserverjava.models.Widget;
import com.example.wbdvsu19Qinserverjava.services.WidgetService;

@RestController
@CrossOrigin("*")
public class WidgetController {

    @Autowired
    WidgetRepository widgetRepository;
    // CRUD
    
    // POST - Creating 
    @PostMapping("/api/widgets")
    public void createWidget(@RequestBody Widget widget) {
        widgetRepository.save(widget);
    }
    
    // GET - Reading
    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return widgetRepository.findAllWidget();
    }
    
    @GetMapping("/api/widgets/{id}")
    public Widget findWidgetById(@PathVariable("id") Integer id) {
    	return widgetRepository.findWidgetById(id);
    }
    
    
    // UPDATE - Updating
    @PutMapping("/api/widgets/{id}")
    public void updateWidget(@PathVariable("id") Integer id, @RequestBody Widget widget) {
        Widget w = widgetRepository.findById(id).get();
        w.setWidget(widget);
        widgetRepository.save(w);
    }
    
    
    // DELETE - Deleting
    @DeleteMapping("/api/widgets/{id}")
    public void deleteWidget(@PathVariable("id") Integer id){
    	 widgetRepository.deleteById(id);
    }
}

