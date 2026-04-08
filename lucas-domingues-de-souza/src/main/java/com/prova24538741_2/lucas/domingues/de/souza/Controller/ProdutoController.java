package com.prova24538741_2.lucas.domingues.de.souza.Controller;

import com.prova24538741_2.lucas.domingues.de.souza.Model.ProdutoModel;
import com.prova24538741_2.lucas.domingues.de.souza.Repository.ProdutoRepository;
import com.prova24538741_2.lucas.domingues.de.souza.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> save(@RequestBody ProdutoModel produtoModel) {
        return ResponseEntity.status(201).body(produtoService.save(produtoModel));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> findById(@PathVariable Long id) {
        return produtoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> update(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        if (produtoService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtoService.atualizar(produtoModel, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoModel> delete(@PathVariable Long id) {
        if (produtoService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        produtoService.deleteByid(id);
        return ResponseEntity.noContent().build();
    }
}
