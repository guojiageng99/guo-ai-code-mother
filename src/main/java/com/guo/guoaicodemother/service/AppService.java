package com.guo.guoaicodemother.service;

import com.guo.guoaicodemother.model.dto.app.AppQueryRequest;
import com.guo.guoaicodemother.model.entity.User;
import com.guo.guoaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.guo.guoaicodemother.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 */
public interface AppService extends IService<App> {

    public AppVO getAppVO(App app);

    public QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    public List<AppVO> getAppVOList(List<App> appList);

    public Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
