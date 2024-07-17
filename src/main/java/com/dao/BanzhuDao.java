package com.dao;

import com.entity.BanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzhuView;

/**
 * 版主 Dao 接口
 *
 * @author 
 */
public interface BanzhuDao extends BaseMapper<BanzhuEntity> {

   List<BanzhuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
