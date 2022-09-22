package com.zjrcu.druiddb.NamedJdbcTemp;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class UserDaoImp implements UserDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public UserModel getUser(int id) {
        String sql = "select id, name, pswd from tb_user where id=:id";
        MapSqlParameterSource msps = new MapSqlParameterSource();
        msps.addValue("id", id);
        UserModel user = new UserModel();
        namedParameterJdbcTemplate.query(sql, msps, new RowCallbackHandler(){

            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPswd(rs.getString("pswd"));
            }

        });
        return user;
    }

    @Override
    public List<UserModel> getUsers() {
        List<UserModel> userList = new LinkedList<UserModel>();
        String sql = "select id, name, pswd from tb_user";
        namedParameterJdbcTemplate.query(sql, new RowCallbackHandler(){

            UserModel user = null;
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPswd(rs.getString("pswd"));
                userList.add(user);
            }

        });
        return userList;
    }

    @Override
    public int insertUser(UserModel user) {
        String sql = "insert into tb_user(id, name, pswd) values(:id, :name, :pswd)";
        MapSqlParameterSource msps = new MapSqlParameterSource();
        msps.addValue("id", user.getId());
        msps.addValue("name", user.getName());
        msps.addValue("pswd", user.getPswd());
        return namedParameterJdbcTemplate.update(sql, msps);
    }

    @Override
    public int updateUser(UserModel user) {
        String sql = "update tb_user set name=:name, pswd=:pswd where id=:id";
        MapSqlParameterSource msps = new MapSqlParameterSource();
        msps.addValue("name", user.getName());
        msps.addValue("pswd", user.getPswd());
        msps.addValue("id", user.getId());
        return namedParameterJdbcTemplate.update(sql, msps);
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from tb_user where id=:id";
        MapSqlParameterSource msps = new MapSqlParameterSource();
        msps.addValue("id", id);
        return namedParameterJdbcTemplate.update(sql, msps);
    }

}

