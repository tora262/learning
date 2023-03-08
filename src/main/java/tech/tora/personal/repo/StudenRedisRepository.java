package tech.tora.personal.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.tora.personal.entity.Student;

@Repository
public interface StudenRedisRepository extends CrudRepository<Student, String> {
}
