package org.iclass.mvc.dao;

import org.iclass.mvc.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<String> selectOrderByEmail();
    int insert(OrderDto vo);
    List<OrderDto> selectByEmail(String email);
    OrderDto selectByBidx(int bidx);

}
