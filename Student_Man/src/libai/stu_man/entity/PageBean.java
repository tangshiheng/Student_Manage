package libai.stu_man.entity;

import java.util.List;

public class PageBean<T> {
	//��ǰҳ����currentPage
	private int currentPage;
	//��ҳ����totalPage
	private int totalPage;
	//ÿҳ�ļ�¼��pageSize
	private int pageSize;
	//�ܼ�¼��totalSize
	private int totalSize;
	//��ŵ�ǰҳ������ݵļ���
	private List<T> list;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
