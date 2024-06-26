package io.fglab.taskitup.repositories;

import io.fglab.taskitup.domain.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends CrudRepository<TaskList, Long> {

    boolean existsByListIdentifier(String listIdentifier);

    TaskList findByListIdentifier(String listId);

    @Override
    Iterable<TaskList> findAll();

    Iterable<TaskList> findAllByListOwner(String username);

}
