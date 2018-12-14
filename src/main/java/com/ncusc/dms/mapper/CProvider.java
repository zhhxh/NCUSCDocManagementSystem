package com.ncusc.dms.mapper;

import com.ncusc.dms.pojo.Course;
import org.apache.ibatis.jdbc.SQL;

/**
 * 动态
 * @author Wang Yiqing
 * @version 1.0.0
 */
public class CProvider {
    public String updateCourse(final Course course)
    {
        return new SQL(){
            {
                UPDATE("t_course_info");
                if(course.getcId() != null)
                    SET("cId = #{cId}");
                if(course.getcName()!= null)
                    SET("cName = #{cName}");
                if(course.getCredit() != 0)
                    SET("credit = #{credit}");
                if(course.getEndDate() !=null)
                    SET("endDate = #{endDate}");
                if(course.getStartDate() != null)
                    SET("startDate = #{startDate}");
                if(course.getSemester() != 0)
                    SET("semestere = #{semestere}");

                WHERE("cId = #{cId}");
            }
        }.toString();
    }
}
