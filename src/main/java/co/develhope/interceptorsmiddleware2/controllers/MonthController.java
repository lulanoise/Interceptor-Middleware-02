package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.MonthRepository.MonthRepository;
import co.develhope.interceptorsmiddleware2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private MonthRepository monthRepository;

    @GetMapping
    public Month returnMonth(HttpServletRequest request){
        return (Month)request.getAttribute("month");
    }
}
