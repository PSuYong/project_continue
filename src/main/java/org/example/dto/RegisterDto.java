package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String username;
    private String password;
    private String name;
}
//프론트 <-> DTO <-> User
//컨트롤러에서 로직을 처리하기 위해서 서비스단으로 Dto를 보낸다.
// 서비스에서 DTO에 있는 값을 엔티티로 바꿔 리포지토리에 저장
