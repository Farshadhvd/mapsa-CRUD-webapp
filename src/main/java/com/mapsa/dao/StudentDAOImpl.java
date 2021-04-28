package com.mapsa.dao;

import com.mapsa.models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO{

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","f.hsv92@gmail.com");
//    }

    @Override
    public void save(Student student) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("There is a problem with creating Class object for connection!");
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","f.hsv92@gmail.com");

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO test.student2 (name, family, age, sID) VALUES (?,?,?,?)");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getFamily());
        preparedStatement.setInt(3, student.getAge());
        preparedStatement.setString(4, student.getsID());
        preparedStatement.executeUpdate();
    }
}
