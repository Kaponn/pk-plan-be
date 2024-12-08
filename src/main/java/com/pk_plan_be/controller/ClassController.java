package com.pk_plan_be.controller;

import com.pk_plan_be.model.Class;
import com.pk_plan_be.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.findAll();
    }

    @GetMapping("/{id}")
    public Class getClassById(@PathVariable Long id) {
        return classService.findById(id);
    }

    @PostMapping
    public Class createClass(@RequestBody Class clazz) {
        return classService.save(clazz);
    }

    @PutMapping("/{id}")
    public Class updateClass(@PathVariable Long id, @RequestBody Class clazz) {
        clazz.setId(id);
        return classService.save(clazz);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteById(id);
    }
}