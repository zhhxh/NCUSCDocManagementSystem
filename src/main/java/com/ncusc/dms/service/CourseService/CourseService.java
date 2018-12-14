package com.ncusc.dms.service.CourseService;

import com.ncusc.dms.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Course的service类
 * @author  YangLi
 * @version  1.0.0
 */
@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;


}
