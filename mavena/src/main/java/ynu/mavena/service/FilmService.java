package ynu.mavena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.mavena.dao.FilmDao;
import ynu.mavena.entity.Film;
import ynu.mavena.entity.Page;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    FilmDao filmDao;

    public List<Film> getFilmsByPage(Page page){
        return filmDao.getFilmsByPage(page);
    }

}
