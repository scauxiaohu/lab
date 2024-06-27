package com.lab.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lab.domain.Course;
import com.lab.service.CourseService;
import com.lab.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
* @author 64573
* @description 针对表【course】的数据库操作Service实现
* @createDate 2024-06-27 20:03:08
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService{

}




