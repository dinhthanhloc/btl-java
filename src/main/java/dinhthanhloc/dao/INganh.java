package dinhthanhloc.dao;

import dinhthanhloc.model.NganhEntity;

public interface INganh extends GenericDAO<NganhEntity>{
	NganhEntity findOne(String TenNganh);
}
