package study.datajpa.entity;

import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    private String username;
    public MemberDto(Member m) {
        this.id = m.getId();
        this.username = m.getUsername();

    }
}
