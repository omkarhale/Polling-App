package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Option {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
private String desc;
private int votes;

@ManyToOne
@JoinColumn(name = "poll_id")
private Poll poll;
}
