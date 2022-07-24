package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

    @FeignClient(value = "course-list", fallback = CourseListClientHystrix.class) // 针对course-list服务
    @Primary
    public interface CourseListClient {

    @GetMapping("/courses")
    List<Course> courseList();
}
