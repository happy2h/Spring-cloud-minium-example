package com.imooc.course.dao;

import com.imooc.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CoursePriceMapper {

    @Select("select * from course_price where course_id = #{courseId}")
    CoursePrice getCoursePrice(@Param("courseId") Integer courseId);

    // 查询价格
    @Select("select price from course_price where course_id = #{courseId}")
    Integer getPrice(@Param("courseId") Integer courseId);
}
