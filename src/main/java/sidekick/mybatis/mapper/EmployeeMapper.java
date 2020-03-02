package sidekick.mybatis.mapper;

import sidekick.mybatis.bean.Employee;

/**
 * @ProjectName: sidekick_mybatis
 * @Package: sidekick.mybatis.mapper
 * @ClassName: EmployeeMapper
 * @Author: sidekick_boy
 * @Description: ${description}
 * @Date: 2020/2/26--23:34
 * @Version: 1.0
 */
public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);
}
