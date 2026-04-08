package com.prova24538741_2.lucas.domingues.de.souza.Service;

import com.prova24538741_2.lucas.domingues.de.souza.Model.ProdutoModel;
import com.prova24538741_2.lucas.domingues.de.souza.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoModel save(ProdutoModel produtoModel) {
        return repository.save(produtoModel);
    }

    public List<ProdutoModel> findAll() {
        return repository.findAll();
    }

    public Optional<ProdutoModel> findById(Long id) {
        return repository.findById(id);
    }

    public ProdutoModel atualizar(ProdutoModel produtoModel, Long id) {
        ProdutoModel produtoExistente = repository.findById(id).
                orElseThrow(()-> new RuntimeException("produto não encontrado"));

        produtoExistente.setNomeProduto(produtoModel.getNomeProduto());
        produtoExistente.setDescricaoProduto(produtoModel.getDescricaoProduto());
        produtoExistente.setStatusProduto(produtoModel.getStatusProduto());
        produtoExistente.setPrecoProduto(produtoModel.getPrecoProduto());
        return repository.save(produtoExistente);
    }

    public void deleteByid(Long id) {
        repository.deleteById(id);
    }
}
