package com.lab.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lab.domain.Class;
import com.lab.service.ClassService;
import com.lab.mapper.ClassMapper;
import org.springframework.stereotype.Service;

/**
* @author 64573
* @description 针对表【class】的数据库操作Service实现
* @createDate 2024-06-27 20:03:08
*/
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class>
    implements ClassService{

}




