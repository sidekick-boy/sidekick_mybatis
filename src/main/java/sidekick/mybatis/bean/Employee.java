package sidekick.mybatis.bean;

import org.apache.ibatis.type.Alias;

/**
 * @ProjectName: sidekick_mybatis
 * @Package: sidekick.mybatis.bean
 * @ClassName: Employee
 * @Author: sidekick_boy
 * @Description: ${description}
 * @Date: 2020/2/25--23:37
 * @Version: 1.0
 */
@Alias("emp")
public class Employee {
    private int id;
    private String lastName;
    private String gender;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
