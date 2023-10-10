package org.example.Entity;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import java.time.LocalDateTime;

@Entity // pk 지정이 필요
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Notice {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GeneratedValue, 값이 어떻게 만들어지는지 설정, GenerationType.IDENTITY, 자동으로 값 만들어지게 한다
    private long id;

    @Column
    private String title;

    @Column
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_table_id")
    private User user;

    @Column
    private LocalDateTime regDate;

    @Column
    private LocalDateTime updateDate;

    // 조회수
    @Column
    private int hits;

    // 좋아요
    @Column
    private int likes;

    // 삭제 여부
    @Column
    private boolean deleted;

    // 삭제 날짜짜
    @Column
    private LocalDateTime deletedDate;
}
