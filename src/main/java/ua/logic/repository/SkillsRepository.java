package ua.logic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.logic.entity.Skill;

@RepositoryRestResource(collectionResourceRel = "skills", path = "skills")
public interface SkillsRepository extends CrudRepository<Skill, Long> {
}
