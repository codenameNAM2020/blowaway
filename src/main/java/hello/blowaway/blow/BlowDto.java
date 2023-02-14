package hello.blowaway.blow;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BlowDto {

    private int wid;                // 글 Id
    private int uid;                // 사용자 Id
    private String name;            // 사용자 이름
    private String content;        // 내용
    private LocalDateTime cdate;    // 작성일
    private LocalDateTime udate;    // 수정일
    private int hit;                // 조회수
    private int likes;              // 좋아요 수
}
