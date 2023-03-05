package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        //查询功能前开启分页功能
        Page<Object> page = PageHelper.startPage(5,4);
        List<Emp> list =  mapper.selectByExample(null);
        //查询功能之后可以获得分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list,5); //5是导航分页的页码数
        list.forEach(System.out::println);
        System.out.println(pageInfo);
    }
}
