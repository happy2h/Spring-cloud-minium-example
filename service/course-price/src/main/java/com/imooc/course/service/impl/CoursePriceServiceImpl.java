package com.imooc.course.service.impl;


import com.imooc.course.client.CourseListClient;
import com.imooc.course.dao.CoursePriceMapper;
import com.imooc.course.entity.Course;
import com.imooc.course.entity.CourseAndPrice;
import com.imooc.course.entity.CoursePrice;
import com.imooc.course.service.CoursePriceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("coursePriceService")
public class CoursePriceServiceImpl implements CoursePriceService {

    @Autowired
    private CourseListClient courseListClient;
    @Autowired
    private CoursePriceMapper coursePriceMapper;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.getCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCourseAndPrice() {
        List<CourseAndPrice> ret = new ArrayList<>();
        // 从list服务拿到课程列表
        List<Course> courses = courseListClient.courseList();
        for(Course course : courses){
            if(course != null){
                CourseAndPrice courseAndPrice = new CourseAndPrice();
                Integer price = coursePriceMapper.getPrice(course.getCourseId());
                // 设置属性
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPrice.setCourseName(course.getCourseName());
                courseAndPrice.setId(course.getId());
                courseAndPrice.setCoursePrice(price);
                ret.add(courseAndPrice);
            }
        }
        return ret;
    }
}
