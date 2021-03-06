package com.radio.streamer.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "kategorije")
public class Kategorija {



  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false, unique = true)
  private String name;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
