package com.jwtExample.jwt.model;

import lombok.*;


public class User {

      private int userId;

      private String name;

      private String email;

      public User(int userId, String name, String email) {
            this.userId = userId;
            this.name = name;
            this.email = email;
      }

      public User(){

      }

      public int getUserId() {
            return userId;
      }

      public String getName() {
            return name;
      }

      public String getEmail() {
            return email;
      }

      public void setUserId(int userId) {
            this.userId = userId;
      }

      public void setName(String name) {
            this.name = name;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      @Override
      public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
      }
}
