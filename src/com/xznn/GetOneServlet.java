package com.xznn;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetOneServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*获取一个对象*/

        response.setContentType("text/html;charset=utf-8");

        Hero hero = new Hero();
        hero.setName("新垣结衣");
        hero.setHp(100);

        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("data", JSONObject.fromObject(hero));
        jsonObject.put("hero", JSONObject.fromObject(hero));
        System.out.println(jsonObject);

        response.getWriter().write(jsonObject.toString());
    }
}