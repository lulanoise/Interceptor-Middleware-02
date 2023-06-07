package co.develhope.interceptorsmiddleware2.interceptors;

import co.develhope.interceptorsmiddleware2.entities.Month;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.List;


@Component
public class MonthInterceptor implements HandlerInterceptor {

    List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1, "January", "Gennaio", "Jänuar"),
            new Month(2, "February", "Febbraio", "Februar"),
            new Month(3, "March", "Marzo", "Marz"),
            new Month(4, "April", "Aprile", "April"),
            new Month(5, "May", "Maggio", "Mai"),
            new Month(6, "July", "Giugno", "Juni")
    ));

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if (monthNumber == null) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            return true;
        } else if (monthList.stream().anyMatch(month -> month.getMonthNumber() == Integer.parseInt(monthNumber))) {
            Month month = monthList.get(Integer.parseInt(monthNumber) - 1);
            request.setAttribute("month", month);
            response.setStatus(HttpStatus.OK.value());
            return true;
        } else {
            Month month = new Month(0, "nope", "nope", "nope");
            request.setAttribute("month", month);
            return true;
        }
    }
}