package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.model.Department;
import com.example.model.Gender;
import com.example.model.User;
import com.example.util.DBConnection;

public class UserDAO {
    public boolean registerUser(User user) {
        String query =
            "INSERT INTO users(name,email,password,gender,department) VALUES(?,?,?,?,?)";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);   
        ) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getGender().name());
            stmt.setString(5, user.getDepartment().name());

            int rows = stmt.executeUpdate();

            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    } 
    
    public User login(String email, String password) {

        String query =
            "SELECT * FROM users WHERE email=? AND password=?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
        ) {
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    Gender.valueOf(rs.getString("gender")),
                    Department.valueOf(rs.getString("department"))
            );
        }
        return null;
    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException(e.getMessage());
    }
}
}