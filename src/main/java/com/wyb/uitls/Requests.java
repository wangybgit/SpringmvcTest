package com.wyb.uitls;


import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by jia on 2015/7/26.
 */
public class Requests {

    public static HttpServletRequest getRequest() {
        RequestAttributes ra = RequestContextHolder.currentRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        return sra.getRequest();
    }

    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    public static HttpSession getSession(boolean isCreate) {
        return getRequest().getSession(isCreate);
    }

}
