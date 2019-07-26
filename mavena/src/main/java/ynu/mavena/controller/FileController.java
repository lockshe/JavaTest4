package ynu.mavena.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ynu.mavena.entity.Film;
import ynu.mavena.entity.Page;
import ynu.mavena.service.FilmService;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Service;
import java.util.List;

@RestController
public class FileController {

    private static Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    FilmService filmService;

    @GetMapping("/")
    public List<Film> getFilmsByPage(@RequestParam("page") int page, @RequestParam("pagesize") int pagesize, @RequestParam("sort") String sort , HttpServletRequest request){

        Page page1 = new Page(pagesize,(page-1)*pagesize,sort);
        List<Film> films = filmService.getFilmsByPage(page1);
        for (Film film : films ) {
            logger.info(film.toString());
        }
        return films;
    }

}
