package ei.aliyun.dao;

import java.util.List;

public interface BaseDAO<T> {

    public void save(T t);
    public List<T> findAll();

}
