package com.example.wbdvsu19Qinserverjava.models;

import javax.persistence.*;

@Entity
@Table(name="Widgets")
public class Widget {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private WidgetType type;
	private String ordered;
	private String text;
	private String url, src;
	private Integer size;
	private Integer width,height;
	private String cssClass;
	private String style;
	private String value;

   

	
	public void setWidget(Widget w) {
		this.name = w.name;
		this.id = w.id;
		this.type = w.type;
		this.ordered = w.ordered;
		this.text = w.text;
		this.url = w.url;
		this.src= w.src;
		this.size = w.size;
		this.width = w.width;
		this.height = w.height;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public WidgetType getType() {
		return type;
	}


	public void setType(WidgetType type) {
		this.type = type;
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


   
}


