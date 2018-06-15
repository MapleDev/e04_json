package com.xznn;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class GetManyServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /* JSON从SERVLET获取多个对象 */

        response.setContentType("text/html;charset=utf-8");

        ArrayList<Hero> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero hero = new Hero();
            hero.setName("新垣结衣" + i);
            hero.setHp(i);
            list.add(hero);
        }

        System.out.println(JSONArray.fromObject(list));
        response.getWriter().write(JSONArray.fromObject(list).toString());
    }
}