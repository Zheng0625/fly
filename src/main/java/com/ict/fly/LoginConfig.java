package com.ict.fly;
/**
 * 自定义拦截器
 */

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component  //@Component注解，这个注解是为后面的使用时进行注入。
public class LoginConfig implements HandlerInterceptor {
    /**
     * 进入controller层之前拦截请求
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("---------------------开始进入请求地址拦截----------------------------");
//        HttpSession session = request.getSession();
//        Object account = session.getAttribute("USER_SESSION");
//        if (account != null) {
//            return true;
//        }
//        //request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
//        String contextPath = request.getContextPath();
//        response.sendRedirect(contextPath + "/index/plane");
//        return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------------处理请求完成后视图渲染之前的处理操作------------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("----------------------视图渲染之后的操作----------------------------");
    }
}

