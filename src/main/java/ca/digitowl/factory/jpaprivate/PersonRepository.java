package ca.digitowl.factory.jpaprivate;

import org.springframework.data.jpa.repository.JpaRepository;

interface PersonRepository extends JpaRepository<Person, Long> {
}
