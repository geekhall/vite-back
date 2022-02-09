package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Menu;
import cn.geekhall.server.mapper.MenuMapper;
import cn.geekhall.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiny
 * @since 2022-02-09
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
