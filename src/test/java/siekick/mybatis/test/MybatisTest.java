package siekick.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import sidekick.mybatis.bean.Employee;
import sidekick.mybatis.mapper.EmployeeMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: sidekick_mybatis
 * @Package: sidekick.mybatis.test
 * @ClassName: MybatisTest
 * @Author: sidekick_boy
 * @Description: ${description}
 * @Date: 2020/2/26--0:03
 * @Version: 1.0
 */
public class MybatisTest {

/*    @Test
    public void test1() throws IOException {
        String resource = "mybatis_config";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Employee employee = session.selectOne("sidekick.mybatis.EmployeeMapper.selectEmp", 1);
//            System.out.println(employee);
        }
    }*/

    @Test
    public void test2() throws IOException {
        String resource = "mybatis_config";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployeeById(1);
            System.out.println(employee);
        }
    }
}
