package com.jager.crowd.service.api;

import com.jager.crowd.entity.vo.DetailProjectVO;
import com.jager.crowd.entity.vo.PortalTypeVO;
import com.jager.crowd.entity.vo.ProjectVO;

import java.util.List;

public interface ProjectService {

    void saveProject(ProjectVO projectVO, Integer memberId);

    List<PortalTypeVO> getPortalTypeVO();

    DetailProjectVO getDetailProjectVO(Integer projectId);

}
