package com.example.demo.web.home.act;

import com.example.demo.web.home.vo.SalaryModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeAction {
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();

        //salary 객체 리스트 변수
        List<SalaryModel> salaryList = new ArrayList<SalaryModel>();

        //salaryModle
        SalaryModel salaryModel;

        // 첫 번째 데이터
        salaryModel = SalaryModel.builder()
                .id(1)
//                .name("AAA")
                .email("AAA@example.com").build();
        salaryList.add(salaryModel);


        // 두 번째 데이터
        salaryModel = SalaryModel.builder()
                .id(2)
                .name("BBB")
                .email("BBB@example.com").build();
        salaryList.add(salaryModel);


        // 세 번째 데이터
        salaryModel = SalaryModel.builder()
                .id(3)
                .name("CCC")
                .email("CCC@example.com").build();
        salaryList.add(salaryModel);


        mav.addObject("salaryList",salaryList);
        mav.setViewName("content/home");

        return mav;
    }
}