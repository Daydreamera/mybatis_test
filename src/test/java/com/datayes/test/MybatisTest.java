package com.datayes.test;

import com.datayes.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SQLSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);      //构建者模式：把对象的创建细节隐藏，使用者直接调用方法即可拿到对象。
        //3.使用工厂SQLSession对象
        SqlSession session = factory.openSession();         //工厂模式：解耦(降低类之间的依赖关系)
        //4.使用SQLSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class); //代理模式：不修改源码的基础上对已有方法增强
        //5.使用代理对象执行方法
//        List<User> users = userDao.findAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
        String userName = userDao.findName();
        System.out.println(userName);
        //6.释放资源
        session.close();
        in.close();
    }
}
