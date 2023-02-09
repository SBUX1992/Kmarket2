/*
날짜 : 2023/02/08
이름 : 김동근
내용 : Kmarket2 SpringBoot product dao
*/
package kr.co.kmarket2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import kr.co.kmarket2.vo.ProductVO;

@Mapper
@Repository
public interface ProductDAO {
	public void insertProduct(ProductVO vo);
	public ProductVO selectProduct(String no);
	public List<ProductVO> selectProducts();
	public void updateProduct(ProductVO vo);
	public void deleteProduct(String no);
	
	// product/list
	public List<ProductVO> selectProductsByCate(@Param("cate1") String cate1, @Param("cate2") String cate2, @Param("order") String order, @Param("start") int start);
}
