package com.bjsxt.configclient2.mapper;

import com.bjsxt.order_resource.pojo.TOrder;
import com.bjsxt.order_resource.pojo.TOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TOrderMapper {
//    int countByExample(TOrderExample example);
//
//    int deleteByExample(TOrderExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(TOrder record);
//
//    int insertSelective(TOrder record);

    List<TOrder> selectByLimit(@Param("page") int page,@Param("rows") int rows);

//    List<TOrder> selectByExample(TOrderExample example);
//
//    TOrder selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);
//
//    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);
//
//    int updateByPrimaryKeySelective(TOrder record);
//
//    int updateByPrimaryKey(TOrder record);
}