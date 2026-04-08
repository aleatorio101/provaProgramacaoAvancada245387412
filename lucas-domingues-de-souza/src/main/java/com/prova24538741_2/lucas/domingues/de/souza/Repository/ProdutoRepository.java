package com.prova24538741_2.lucas.domingues.de.souza.Repository;

import com.prova24538741_2.lucas.domingues.de.souza.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
