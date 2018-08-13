package my.luftbohne.books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("These are my books!", HttpStatus.OK);
    }
}
