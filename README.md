# Demo
ssm 需要导入的包
前端用到的
spring-webmvc 负责展示层
jsackson 负责前端的数据交互

数据库要用到的.
spring-jdbc          负责数据库链接
mybatis              负责封装jdbc链接
mybatis-sprimg       负责整合mybatis与spring框架
comomns-dbcp         数据库链接池
mysql-connector-java 数据库驱动. 

AOP面向切面编程
org.aspectj

操作生成execl文件
poi-scratchpad  

文件上传
commons-fileupload  

测试工具
junit
把项目添加到tomcat上以后,按下面步骤测试.

配置web.xml文件.也就是建立servlet. 再使用springmvc以后,用dispacherServlet替代了. 并加上<load-on-startup>1</load-on-startup> web.xml文件中可能会配置过滤器filter,如果要使用拦截器可以再spring-*.xml的文件中配置<mvc:interceptors>.

配置spring的spring-*.xml的配置文件.

需要配置数据库连接池BasicDataSource

配置配置mybatis的SqlSessionFactoryBean

配置配置 Mapper 接口扫描器 mybatis -spring 下的包MapperScannerConfigurer

配置事务管理器：基于dataSource的事务管理器 DataSourceTransactionManager 用于驱动 @Transactional 注解

<tx:annotation-driven transaction-manager="txMgr"/>
3,建立dao,然后建立mapper文件.测试以后,建立serviceImpl 及controller .


