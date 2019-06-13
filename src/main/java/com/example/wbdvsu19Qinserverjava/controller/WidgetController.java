package com.example.wbdvsu19Qinserverjava.controller;

import java.util.List;

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
      WidgetService wid= new WidgetService();
    // CRUD
    
    // POST - Creating 
    @PostMapping("/api/widgets")
    public List<Widget> createWidget(@RequestBody Widget widget) {
        return wid.createWidget(widget);
    }
    
    // GET - Reading
    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return wid.findAllWidgets();
    }
    
    @GetMapping("/api/widgets/{id}")
    public Widget findWidgetById(@PathVariable("id") long id) {
    	return wid.findWidgetById(id);
    }
    
    
    // UPDATE - Updating
    @PutMapping("/api/widgets/{id}")
    public List<Widget> updateWidget(@PathVariable("id") long id, @RequestBody Widget widget) {
    	return wid.updateWidget(id, widget);
    }
    
    
    // DELETE - Deleting
    @DeleteMapping("/api/widgets/{id}")
    public List<Widget> deleteWidget(@PathVariable("id") long id){
    	return wid.deleteWidget(id);
    }
}

