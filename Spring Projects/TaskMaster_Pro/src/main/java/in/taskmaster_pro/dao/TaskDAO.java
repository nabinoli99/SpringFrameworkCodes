package in.taskmaster_pro.dao;

import in.taskmaster_pro.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TaskDAO {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    public List<Task> getAllTasks() {
        return jdbc.query("SELECT * FROM tasks", new BeanPropertyRowMapper<>(Task.class));
    }

    // Inside TaskDAO.java
    public void saveTask(Task task) {

        String sql = "INSERT into tasks (title, description, completed) VALUES (:title, :description, :completed)";

        SqlParameterSource params = new BeanPropertySqlParameterSource(task);
        jdbc.update(sql, params);
    }

    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = :id";
        jdbc.update(sql, new MapSqlParameterSource("id", id));
    }
}