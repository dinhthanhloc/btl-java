package dinhthanhloc.dao;

import java.util.List;

import dinhthanhloc.model.NhomEntity;
import dinhthanhloc.paging.Pageble;

public interface INhom extends GenericDAO<NhomEntity>{
	NhomEntity findOne(Long MaNhom);
	Long save(NhomEntity newNhom);
	void update(NhomEntity updateNhom);
	void delete(long id);
	List<NhomEntity> findAll(Pageble pageble);
	int getTotalItem();
}
