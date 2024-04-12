package com.example.challenge_yourself_1.model;

public class Family {
     private String name;
     private int age;
     private String relation;

     public Family(String name, int age, String relation) {
          this.name = name;
          this.age = age;
          this.relation = relation;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getRelation() {
          return relation;
     }

     public void setRelation(String relation) {
          this.relation = relation;
     }
}
