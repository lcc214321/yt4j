package cn.yt4j.data.batch;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gyv12345@163.com
 */
public interface Yt4jBatchMapper<T> extends BaseMapper<T> {

	/**
	 * 不同数据库批量插入方式肯定是不同的 批量插入
	 * @param batchList
	 * @return
	 */
	int batchInsertByMysql(@Param("list") List<T> batchList);

}
