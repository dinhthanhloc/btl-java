package dinhthanhloc.dao;

import java.util.List;

import dinhthanhloc.model.DetaiEntity;

public interface IDeTai extends GenericDAO<DetaiEntity>{
	DetaiEntity findOne(Long MaDeTai);
	Long save(DetaiEntity newDeTai);
	void update(DetaiEntity updateDeTai);
	void delete(long id);
	List<DetaiEntity> findAll();
	int getTotalItem();
}
