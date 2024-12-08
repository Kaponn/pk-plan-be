package com.pk_plan_be.service;

import com.pk_plan_be.model.Class;
import com.pk_plan_be.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> findAll() {
        return classRepository.findAll();
    }

    public Class findById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class save(Class clazz) {
        return classRepository.save(clazz);
    }

    public void deleteById(Long id) {
        classRepository.deleteById(id);
    }
}