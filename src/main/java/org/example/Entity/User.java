package org.example.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String username;

    @JsonIgnore // 패스워드는 민감정보이므로, JSON으로 데이터 이동간에 숨겨버린다.
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;
//
//    private String roles; // USER, ADMIN
//
//    public List<String> getRoleList() {
//        if (this.roles.length() > 0) {
//            return Arrays.asList(this.roles.split(","));
//        }
//        return new ArrayList<>();
//    }
}
