package com.qingcity.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.qingcity.entity.music.MusicEntity;

@Repository
public interface MusicMapper {

	/**
	 * 根据前置条件查询歌曲id,主要用于解锁打歌歌曲
	 * 
	 * @param preCondition
	 *            前置条件
	 * @return 符合条件的歌曲id
	 */
	public int selectMusicIdByPreCondition(int preCondition);

	/**
	 * 查询当前城下歌曲的数量
	 * 
	 * @param city
	 * @return
	 */
	public int selectMusicNum(int city);

	/**
	 * 根据id删除音乐
	 * 
	 * @param musicid
	 *            歌曲id
	 * @return 返回删除的行数
	 */
	public int deleteByMusicId(Integer musicid);

	/**
	 * 新加入歌曲信息
	 * 
	 * @param music
	 *            歌曲实体
	 * @return 返回添加的歌曲数
	 */
	public int insertMusic(MusicEntity music);

	/**
	 * 可选择性的添加音乐信息
	 * 
	 * @param music
	 *            歌曲实体
	 * @return 返回添加的歌曲数
	 */
	public int insertMusicSelective(MusicEntity music);

	/**
	 * 根据id选择音乐
	 * 
	 * @param musicId
	 *            歌曲ID
	 * @return 返回歌曲实体
	 */
	public MusicEntity selectMusicByMusicId(Integer musicId);

	/**
	 * 根据歌曲id更新歌曲的前置解锁条件
	 * 
	 * @param musicId
	 *            音乐id
	 * @param preCondition
	 *            解锁前置条件
	 * @return 更新的音乐id
	 */
	public int updatePreCondition(@Param("musicId") int musicId, @Param("preCondtion") int preCondition);

	/**
	 * 根据音乐名称更改音乐信息
	 * 
	 * @param music
	 *            音乐信息实体对象
	 * @return 更新行数/音乐id
	 */
	public int updateMusicByMusicName(MusicEntity music);

	/**
	 * 根据音乐id更改音乐信息
	 * 
	 * @param music
	 *            音乐信息实体对象
	 * @return 更新行数/音乐id
	 */
	public int updateMusicByMusicId(MusicEntity music);
}