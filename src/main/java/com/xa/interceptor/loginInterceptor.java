package com.xa.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginInterceptor implements HandlerInterceptor {
    //前置
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        HttpSession session = httpServletRequest.getSession();
        Object userInfo = session.getAttribute("user");
        System.out.println(1);
        if(uri.indexOf("login")>=0||uri.indexOf("selectUserInfo1") >= 0){
            System.out.println(2);
            return true;
        }
        System.out.println(3);
        if (userInfo!=null){
            System.out.println(4);
            return true;
        }
        System.out.println(5);
            httpServletRequest.setAttribute("msg", "您还没有登录，请先登录！");
            httpServletRequest.getRequestDispatcher("login.html").forward(httpServletRequest, httpServletResponse);
            return false;

    }
    //处理
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    //后置
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
