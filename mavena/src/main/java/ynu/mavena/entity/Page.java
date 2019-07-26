package ynu.mavena.entity;

public class Page {

    private int pageSize;

    private int page;

    private String sort = "ASC";

    public Page(int pageSize, int page, String sort) {
        this.pageSize = pageSize;
        this.page = page;
        this.sort = sort;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
