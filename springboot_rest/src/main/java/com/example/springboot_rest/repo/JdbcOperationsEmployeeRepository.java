//package com.example.springboot_rest.repo;
//
//import com.example.springboot_rest.entity.Employee;
//import com.example.springboot_rest.entity.EmployeeRecord;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.UUID;
//
//public class JdbcOperationsEmployeeRepository implements EmployeeRepository, RowMapper<EmployeeRecord> {
//
//    private final NamedParameterJdbcTemplate template;
//
//    public JdbcOperationsEmployeeRepository(NamedParameterJdbcTemplate template) {
//        this.template = template;
//    }
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return null;
//    }
//
//    @Override
//    public void saveEmployees() {
//
//    }
//
//    @Override
//    public Employee getEmployeeById(int id) {
//        return null;
//    }
//
//    @Override
//    public void deleteEmployeeById(int id) {
//
//    }
//
//    @Override
//    public EmployeeRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new EmployeeRecord(rs.getObject("id", UUID.class),
//                rs.getString("name"),
//                rs.getString("surname"),
//                rs.getString("department"),
//                rs.getInt("salary"));
//    }
//}
