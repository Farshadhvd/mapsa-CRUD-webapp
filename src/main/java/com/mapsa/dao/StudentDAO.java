package com.mapsa.dao;

import com.mapsa.models.Student;

import java.sql.SQLException;

public interface StudentDAO {
    void save(Student student) throws SQLException;
}
