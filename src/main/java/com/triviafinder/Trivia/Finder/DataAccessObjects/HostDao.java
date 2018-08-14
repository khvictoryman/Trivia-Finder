package com.triviafinder.Trivia.Finder.DataAccessObjects;

import com.triviafinder.Trivia.Finder.Object_Models.HostModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface HostDao extends CrudRepository<HostModel, Integer> {
}