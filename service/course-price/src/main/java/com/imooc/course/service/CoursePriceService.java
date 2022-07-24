package com.imooc.course.service;

import com.imooc.course.entity.CourseAndPrice;
import com.imooc.course.entity.CoursePrice;

import java.util.List;

public interface CoursePriceService {
    CoursePrice getCoursePrice(Integer courseId);

    List<CourseAndPrice> getCourseAndPrice();
 }
