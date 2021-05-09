package com.jager.crowd.test;

import com.jager.crowd.entity.Admin;
import com.jager.crowd.entity.Role;
import com.jager.crowd.mapper.AdminMapper;
import com.jager.crowd.mapper.RoleMapper;
import com.jager.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//在类上标记必要的注解，Spring整合Junit
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml", "classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testRoleSave() {
        for (int i = 0; i < 235; i++) {
            roleMapper.insertSelective(new Role(null, "role" + i));
        }
    }

    @Test
    public void add() {
        for (int i = 0; i < 500; i++) {
            Admin admin = new Admin(null, "levi" + i, "123456", "akm", "levi@gmail.com", null);
            adminService.saveAdmin(admin);
        }
    }

    @Test
    public void TestTx() {
        Admin admin = new Admin(null, "levi", "123456", "akm", "levi@gmail.com", null);
        adminService.saveAdmin(admin);

    }

    @Test
    public void TestLog() {
        //1.获取Logger对象，这里传入的Class对象就是当前打印日志的类。
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        //2.根据不同的日志级别打印日志
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");

        logger.info("Hello I am Info level!!!");
        logger.info("Hello I am Info level!!!");
        logger.info("Hello I am Info level!!!");

        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");

        logger.error("Error level!!!");
        logger.error("Error level!!!");
        logger.error("Error level!!!");
    }

    @Test
    public void TestInsertAdmin() {
        Admin admin = new Admin(null, "jager", "123456", "eren", "jager@gmail.com", null);
        int count = adminMapper.insert(admin);
        /*
            如果在实际开发中，所有想要查看数值的地方都用sout打印，会给项目上线带来问题。
            sout本质上是一个IO操作，通常IO操作是比较消耗性能的。如果项目中sout很多，那么对性能影响就比较大了。
            即使上线前专门花时间删除代码中的sout也有可能有遗漏，而且非常麻烦。
            而如果使用日志系统，那么可以通过日志级别批量的控制打印信息。
         */
        System.out.println("受影响的行数=" + count);
    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
