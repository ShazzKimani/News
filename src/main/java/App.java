import com.google.gson.Gson;
import dao.DB;
import dao.Sql2oDepartmentDao;
import dao.Sql2oUserDao;
import models.Department;
import models.User;
import org.sql2o.Sql2o;

import java.sql.Connection;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        // This tells our app that if Heroku sets a port for us, we need to use that port.
        // Otherwise, if they do not, continue using port 4567.

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);
        Sql2oDepartmentDao departmentDao;
        Sql2oUserDao userDao;
        Connection conn;
        Gson gson=new Gson();

        staticFileLocation("/public");
        Sql2o sql2o = DB.sql2o;

        departmentDao=new Sql2oDepartmentDao(sql2o);
        userDao=new Sql2oUserDao(sql2o);

        //READ
        get("/departments", "application/json", (req, res) -> {
            System.out.println(departmentDao.getAll());
            if(departmentDao.getAll().size() > 0){
                return gson.toJson(departmentDao.getAll());
            }
            else {
                return "{\"message\":\"Sorry, no departments are available.\"}";
            }
        });

        get("/users", "application/json", (req, res) -> {
            System.out.println(userDao.getAll());
            if(userDao.getAll().size() > 0){
                return gson.toJson(userDao.getAll());
            }
            else {
                return "{Apologies , no users are available.}";
            }
        });


        //CREATE
        post("/departments/new", "application/json", (req, res) -> {
            Department department = gson.fromJson(req.body(), Department.class);
            departmentDao.add(department);
            res.status(201);
            return gson.toJson(department);
        });
        post("/users/new", "application/json", (req, res) -> {
            User user = gson.fromJson(req.body(), User.class);
            userDao.add(user);
            res.status(201);
            return gson.toJson(user);
        });


        after((req, res) ->{
            res.type("application/json");
        });
    }

