package com.mapsa.service;

import com.mapsa.models.Student;

import java.sql.SQLException;

public interface StudentService {
    void save(Student student) throws SQLException;
}
