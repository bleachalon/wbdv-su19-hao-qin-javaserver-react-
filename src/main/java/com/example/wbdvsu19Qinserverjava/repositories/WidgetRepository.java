package com.example.wbdvsu19Qinserverjava.repositories;

import com.example.wbdvsu19Qinserverjava.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository extends CrudRepository<Widget, Integer> {

    @Query("select widget from Widget widget")
    public List<Widget> findAllWidget();

    @Query("select widget from Widget widget where widget.id=:id")
    public Widget findWidgetById(@Param("id") Integer id);
}
