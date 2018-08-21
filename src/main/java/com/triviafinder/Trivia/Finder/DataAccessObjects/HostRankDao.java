package com.triviafinder.Trivia.Finder.DataAccessObjects;

import com.triviafinder.Trivia.Finder.models.host.HostModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface HostRankDao extends CrudRepository<HostModel, Integer> {
}
