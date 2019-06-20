package com.example.wbdvsu19Qinserverjava.repositories;

import com.example.wbdvsu19Qinserverjava.models.Module;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ModuleRepository extends CrudRepository<Module, Integer> {
    @Query("select module from Module module")
    public List<Module> findAllModule();

    @Query("select module from Module module where module.course.id=:cid")
    public List<Module>findAllModulesForCourse(@Param("cid") Integer cid);

    @Query("select  module from Module module where module.id=:id")
    public Module findModuleById(@Param("id") Integer id);

}
