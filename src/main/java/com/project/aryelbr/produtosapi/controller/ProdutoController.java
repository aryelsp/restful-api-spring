package com.project.aryelbr.produtosapi.controller;

import com.project.aryelbr.produtosapi.model.Produto;
import com.project.aryelbr.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Produto> listar(@RequestParam(required = false) String nome){
        if (nome != null) {
            return produtoRepository.findByNome(nome);
        }
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        String id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        System.out.println("Produto recebido: " + produto);
        return produto;
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable String id){
        produtoRepository.deleteById(id);
    }

}
