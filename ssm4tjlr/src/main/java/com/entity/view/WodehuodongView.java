package com.entity.view;

import com.entity.WodehuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 22:52:57
 */
@TableName("wodehuodong")
public class WodehuodongView  extends WodehuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodehuodongView(){
	}
 
 	public WodehuodongView(WodehuodongEntity wodehuodongEntity){
 	try {
			BeanUtils.copyProperties(this, wodehuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}