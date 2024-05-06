package dinhthanhloc.paging;

import dinhthanhloc.sort.Sorter;

public interface Pageble {
	Integer getPage();

	Integer getOffset();

	Integer getLimit();

	Sorter getSorter();
}
