package honor.com.dagger2example.entity;

import javax.inject.Inject;

/**
 * 作者：梁洋 on 2018/11/4 0004 17:02
 * 邮箱：m18513333561@163.com
 */
public class User {

    public String name;
    public String password;

    @Inject
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserHashCode------------->" + hashCode();
    }
}
