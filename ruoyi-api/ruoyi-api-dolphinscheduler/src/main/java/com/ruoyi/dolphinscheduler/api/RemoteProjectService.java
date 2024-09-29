package com.ruoyi.dolphinscheduler.api;

import com.ruoyi.dolphinscheduler.api.factory.RemoteProjectFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.core.constant.SecurityConstants;
import com.ruoyi.common.core.constant.ServiceNameConstants;
import com.ruoyi.common.core.domain.R;

/**
 * 用户服务
 *
 * @author ruoyi
 */
@FeignClient(contextId = "remoteProjectService", value = ServiceNameConstants.DOLPHINSCHEDULER_SERVICE, fallbackFactory = RemoteProjectFallbackFactory.class)
public interface RemoteProjectService {

    @GetMapping("/facade/projects")
    public R projects(String searchVal, Integer pageSize,
                      Integer pageNo, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

}
