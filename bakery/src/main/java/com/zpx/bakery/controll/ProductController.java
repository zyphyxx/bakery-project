package com.zpx.bakery.controll;

import com.zpx.bakery.dto.MyProduct;
import com.zpx.bakery.dto.MyUser;
import com.zpx.bakery.models.Produto;
import com.zpx.bakery.models.User;
import com.zpx.bakery.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProdutoRepository repository;

    @Autowired
    public ProductController(ProdutoRepository repository) {
        this.repository = repository;
    }


    @PostMapping
    @Transactional
    public void create(@RequestBody MyUser myUser){
        User user = new User(myUser);
        repository.save(user);

    }

    @GetMapping
    public List<Produto> read (){
        return repository.findAll();
    }

    @PutMapping
    @Transactional
    public void update (@RequestBody Produto product){
        repository.save(product);

    }

    @DeleteMapping
    public void delete(@RequestBody Produto product){
        repository.delete(product);
    }

}
