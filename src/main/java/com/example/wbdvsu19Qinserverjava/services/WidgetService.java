package com.example.wbdvsu19Qinserverjava.services;

import java.util.ArrayList;
import java.util.List;

import com.example.wbdvsu19Qinserverjava.models.Widget;
import com.example.wbdvsu19Qinserverjava.models.WidgetType;

public class WidgetService {
    List<Widget> widgets = new ArrayList<Widget>();
    
    {widgets.add(new Widget(null,1, WidgetType.Heading, null, null, null ,1, null, null));
    widgets.add(new Widget(null,2, WidgetType.Paragraph, null, null, null ,null, null, null));
    widgets.add(new Widget(null,3, WidgetType.Image, null, null, null ,null, null, null));
    widgets.add(new Widget(null,4, WidgetType.Link, null, null, null ,null, null, null));
    widgets.add(new Widget(null,5, WidgetType.List, null, null, null ,null, null, null));
    }
    
    
    public void createWidget(Widget widget) {
    	widgets.add(widget);
    	
    }
    
    
    public List<Widget> findAllWidgets() {
    	return widgets;
    }
    
    public Widget findWidgetById(long id) {
    	for(Widget w: widgets) {
    		if(w.getId()==id) {
    			return w;
    		}
    	}
    	return null;
    }
    
    
    public void updateWidget(long id, Widget widget){
    	
    	for(int i=0; i<widgets.size(); i++) {
    		if(widgets.get(i).getId()==id) {
    			widgets.get(i).setWidget(widget);
  
    		}
    	}
    }
    
    
    public void deleteWidget(long id) {
    	for(int i=0; i<widgets.size(); i++) {
    		if(widgets.get(i).getId()==id) {
    			widgets.remove(i);
    		}
    	}

    }
    
}
