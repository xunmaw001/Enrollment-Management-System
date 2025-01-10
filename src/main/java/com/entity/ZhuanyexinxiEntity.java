package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 专业信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
@TableName("zhuanyexinxi")
public class ZhuanyexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuanyexinxiEntity() {
		
	}
	
	public ZhuanyexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 专业名称
	 */
					
	private String zhuanyemingcheng;
	
	/**
	 * 专业类别
	 */
					
	private String zhuanyeleibie;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 招录人数
	 */
					
	private String zhaolurenshu;
	
	/**
	 * 招录要求
	 */
					
	private String zhaoluyaoqiu;
	
	/**
	 * 招录状态
	 */
					
	private String zhaoluzhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
	/**
	 * 设置：专业名称
	 */
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
	/**
	 * 设置：专业类别
	 */
	public void setZhuanyeleibie(String zhuanyeleibie) {
		this.zhuanyeleibie = zhuanyeleibie;
	}
	/**
	 * 获取：专业类别
	 */
	public String getZhuanyeleibie() {
		return zhuanyeleibie;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：招录人数
	 */
	public void setZhaolurenshu(String zhaolurenshu) {
		this.zhaolurenshu = zhaolurenshu;
	}
	/**
	 * 获取：招录人数
	 */
	public String getZhaolurenshu() {
		return zhaolurenshu;
	}
	/**
	 * 设置：招录要求
	 */
	public void setZhaoluyaoqiu(String zhaoluyaoqiu) {
		this.zhaoluyaoqiu = zhaoluyaoqiu;
	}
	/**
	 * 获取：招录要求
	 */
	public String getZhaoluyaoqiu() {
		return zhaoluyaoqiu;
	}
	/**
	 * 设置：招录状态
	 */
	public void setZhaoluzhuangtai(String zhaoluzhuangtai) {
		this.zhaoluzhuangtai = zhaoluzhuangtai;
	}
	/**
	 * 获取：招录状态
	 */
	public String getZhaoluzhuangtai() {
		return zhaoluzhuangtai;
	}

}
