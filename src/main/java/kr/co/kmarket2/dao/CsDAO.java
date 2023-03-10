/*
날짜 : 2023/02/13
이름 : 최아영
내용 : Kmarket2 STS CsService
*/
package kr.co.kmarket2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import kr.co.kmarket2.vo.Cs_Cate1VO;
import kr.co.kmarket2.vo.Cs_Cate2VO;
import kr.co.kmarket2.vo.Cs_FaqVO;
import kr.co.kmarket2.vo.Cs_NoticeVO;
import kr.co.kmarket2.vo.Cs_QnaVO;

@Repository
@Mapper
public interface CsDAO {

		
		/* index */
		public List<Cs_NoticeVO> selectCsNoticeList();
	    public List<Cs_QnaVO> selectCsQnaList();
	    
		/* Notice */
		public List<Cs_NoticeVO> selectNoticeArticlesAll(@Param("start") int start);
		public List<Cs_NoticeVO> selectNoticeArticles(@Param("start") int start,@Param("cate1") String cate);
		public Cs_NoticeVO selectNoticeArticle(@Param("no") Integer no);
		public int selectNoticeCountTotalAll();
		public int selectNoticeCountTotal(String cate);
		
		/* Faq */
		public List<Cs_Cate1VO> selectCs_cate1();
		public List<Cs_Cate2VO> selectCs_cate2(Integer cate1);
		public List<Cs_FaqVO> selectCsFaqList(@Param("cate1") Integer cate1,@Param("cate2") Integer cate2);
		public Cs_FaqVO selectCsFaqNo(@Param("no") Integer no);
		
		/* Qna */
		public Cs_Cate1VO selectCate1(@Param("cate1")String cate1);
		public int insertQnaArticle(Cs_QnaVO vo);
		public Cs_QnaVO selectQnaArticle(@Param("no")int no);
		public List<Cs_QnaVO> selectQnaArticles(@Param("start")int start,@Param("cate1") String cate1);
		public Cs_QnaVO selectCsQnaNo(int no);
		public int selectCountTotal(@Param("cate1")String cate1);
}
