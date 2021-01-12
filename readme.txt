Mybatis的练习
使用的是xml文件的方式使用Mybatis

1.创建一个User类
2.创建一个UserDao接口
3.创建一个SqlMapConfig.xml文件	--该文件为mybatis的主配置文件
4.有了主配置文件后还要建立一个接口的独立配置文件UserDao.xml
5.在主配置文件中使用<mapper resource="com/datayes/dao/UserDao.xml"/>来指定独立配置文件的位置
6.在测试文件中测试
