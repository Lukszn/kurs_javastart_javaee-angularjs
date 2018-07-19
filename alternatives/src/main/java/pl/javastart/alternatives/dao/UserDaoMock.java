package pl.javastart.alternatives.dao;

import javax.enterprise.inject.Alternative;

import pl.javastart.alternatives.model.User;

@Alternative
public class UserDaoMock implements UserDao {

    @Override
    public User read(Long id) {
        // zwracamy obiekt bez odwo�ywania si� do bazy
        // tylko na potrzeby test�w / wersji deweloperskiej
        return new User(id, "MockFirst", "MockLast");
    }
}