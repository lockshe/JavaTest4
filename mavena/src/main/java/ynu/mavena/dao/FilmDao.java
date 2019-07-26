package ynu.mavena.dao;

import org.apache.ibatis.annotations.Mapper;
import ynu.mavena.entity.Film;
import ynu.mavena.entity.Page;

import java.util.List;

@Mapper
public interface FilmDao {

    List<Film> getFilmsByPage(Page page);
}
