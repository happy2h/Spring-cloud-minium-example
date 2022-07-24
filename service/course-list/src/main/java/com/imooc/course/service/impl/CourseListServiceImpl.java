package com.imooc.course.service.impl;

import com.imooc.course.dao.CourseMapper;
import com.imooc.course.entity.Course;
import com.imooc.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("courseListService")
public class CourseListServiceImpl implements CourseListService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList() {
        return courseMapper.findValidCourses();
    }
}
