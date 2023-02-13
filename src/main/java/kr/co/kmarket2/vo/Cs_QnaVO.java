/*
날짜 : 2023/02/10
이름 : 최아영
내용 : Kmarket2 STS Cs_QnaVO
*/
package kr.co.kmarket2.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Cs_QnaVO {
	private int no;
	private int comment;
	private String cate1;
	private String cate2;
	private String title;
	private String content;
	private int hit;
	private String uid;
	private String regip;
	private String rdate;
	
	// 추가필드
    private String c1Name;
    private String c2Name;
    
    public String getrdate(){
        return rdate.substring(2, 10);
    }
}
