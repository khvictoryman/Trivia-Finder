package com.triviafinder.Trivia.Finder.DataAccessObjects;

import com.triviafinder.Trivia.Finder.Object_Models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<UserModel, Integer> {
}
