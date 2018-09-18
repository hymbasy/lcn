package com.alex.dao;

import com.alex.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        StringBuilder sql = new StringBuilder("insert into user(name,sex,telephone,email,createTime) values(?,?,?,?,?)");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getName());
                ps.setInt(2, user.getSex());
                ps.setString(3, user.getTelephone());
                ps.setString(4, user.getEmail());
                ps.setDate(5, new Date(System.currentTimeMillis()));
                return ps;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }
}
