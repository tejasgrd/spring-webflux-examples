package dev.tgarde.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.annotation.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {

  @Id
  private int userId;
  @Column("firstName")
  private String firstName;
  @Column("lastName")
  private String lastName;
}
