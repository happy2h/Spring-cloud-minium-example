package com.imooc.course.entity;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer id;
    private Integer courseId;
    private String courseName;
    private Integer valid;

    public Course(Integer id, Integer courseId, String courseName, Integer valid) {
        this.id = id;
        this.courseId = courseId;
        this.courseName = courseName;
        this.valid = valid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", valid=" + valid +
                '}';
    }
}
