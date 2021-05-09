package com.jager.crowd.service.api;

import com.jager.crowd.entity.vo.AddressVO;
import com.jager.crowd.entity.vo.OrderProjectVO;
import java.util.List;

public interface OrderService {

	OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId);

	List<AddressVO> getAddressVOList(Integer memberId);

	void saveAddress(AddressVO addressVO);

}
