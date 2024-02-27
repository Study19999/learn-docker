package agiles.onboarding.learndocker;

import java.util.NoSuchElementException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonJPARepository repository;

    public PersonController(PersonJPARepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/person/{id}")
    public PersonEntity getAll(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Person with id " + id + " not found"));
    }
}
