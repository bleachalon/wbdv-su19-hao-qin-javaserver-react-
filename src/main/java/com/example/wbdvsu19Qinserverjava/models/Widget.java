package com.example.wbdvsu19Qinserverjava.models;

public class Widget {
	enum WidgetDataType{
		Integer, String, Date, Boolean

	}
	
   String name;
   long id;
   WidgetType type;
   Integer order;
   String ordered;
   String text;
   String url, src;
   Integer size;
   Integer width,height;
   String cssClass;
   String style;
   String value;
   WidgetDataType dataType;
   
   
	public Widget() {
		super();
	}
	
	public void setWidget(Widget w) {
		this.name = w.name;
		this.id = w.id;
		this.type = w.type;
		this.order = w.order;
		this.ordered = w.ordered;
		this.text = w.text;
		this.url = w.url;
		this.src= w.src;
		this.size = w.size;
		this.width = w.width;
		this.height = w.height;
	}
	
	public Widget(String name, long id, WidgetType type, Integer order, String text, String url, Integer size,
			Integer width, Integer height) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.order = order;
		this.text = text;
		this.url = url;
		this.size = size;
		this.width = width;
		this.height = height;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public WidgetType getType() {
		return type;
	}


	public void setType(WidgetType type) {
		this.type = type;
	}


	public Integer getOrder() {
		return order;
	}


	public void setOrder(Integer order) {
		this.order = order;
	}

	
	public String getOrdered() {
		return ordered;
	}

	public void setOrdered(String ordered) {
		this.ordered = ordered;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Integer getSize() {
		return size;
	}


	public void setSize(Integer size) {
		this.size = size;
	}


	public Integer getWidth() {
		return width;
	}


	public void setWidth(Integer width) {
		this.width = width;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}


	public String getCssClass() {
		return cssClass;
	}


	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public WidgetDataType getDataType() {
		return dataType;
	}


	public void setDataType(WidgetDataType dataType) {
		this.dataType = dataType;
	}
	   
   
   
}


