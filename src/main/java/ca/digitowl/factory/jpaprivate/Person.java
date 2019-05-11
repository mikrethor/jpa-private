package ca.digitowl.factory.jpaprivate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
  private long id;
  private String name;

  public Person(long id, String name) {
    this.id = id;
    this.name = name;
  }

  private Person() {
  }

  @Id
  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  @Column
  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }
}
