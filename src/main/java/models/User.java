package models;

import java.util.Objects;

public class User {
    private String name;
    private String companyposition;
    private String role;
    private int id;
    private int departmentid;

    public User(String name,int departmentid,String companyposition,String role){
        this.name=name;
        this.departmentid=departmentid;
        this.companyposition=companyposition;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getCompanyposition() {
        return companyposition;
    }

    public void setCompanyposition(String companyposition) {
        this.companyposition = companyposition;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                departmentid == user.departmentid &&
                Objects.equals(name, user.name) &&
                Objects.equals(companyposition, user.companyposition) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, companyposition, role, id, departmentid);
    }

