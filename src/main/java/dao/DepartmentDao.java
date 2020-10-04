package dao;

import models.*;

import java.util.List;

public interface DepartmentDao {
    //CREATE
    void add(Department department);

    //READ
    List<Department> getAll();
    Department findById(int id);

    //UPDATE
    void update(int id, String name, String description);

    //DELETE
    void deleteById(int id);
    void deleteAll();
}
