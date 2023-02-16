package springmvc.dao;

import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    public int saveUser(User user){
        int id = (Integer) hibernateTemplate.save(user);
        return id;
    }
}
