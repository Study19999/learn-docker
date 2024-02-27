package agiles.onboarding.learndocker;

import org.springframework.data.repository.CrudRepository;

public interface PersonJPARepository extends CrudRepository<PersonEntity, Integer> {
}
