package ca.digitowl.factory.jpaprivate;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PersonRepositoryTest {

  @Autowired
  PersonRepository repository;

  @Test
  public void findAll_should_init_two_persons(){
    assertEquals(3,repository.findAll().size());
  }

}