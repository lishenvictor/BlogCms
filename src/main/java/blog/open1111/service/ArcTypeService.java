package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.ArcType;

/**
 * �������Service�ӿ�
 * @author user
 *
 */
public interface ArcTypeService {

	/**
	 * ����������ҳ��ѯ������𼯺�
	 * @param map
	 * @return
	 */
	public List<ArcType> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ����������
	 * @param arcType
	 * @return
	 */
	public Integer add(ArcType arcType);
	
	/**
	 * ����������
	 * @param arcType
	 * @return
	 */
	public Integer update(ArcType arcType);
	
	/**
	 * ��������ɾ��
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
