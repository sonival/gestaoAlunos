package br.com.demo.gestaoalunos.Controllers;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.gestaoalunos.Models.Pessoa;

@RestController("/v1")
public class c1 {
  

  @GetMapping()
  public ResponseEntity<String> getSomething(){
    return ResponseEntity.ok("First Page");
  }


  @PostMapping("/retornarPessoa")
  public ResponseEntity<Pessoa> retornarPessoa(@RequestBody Pessoa novaPessoa){
    Pessoa pessoa =  new Pessoa();
    pessoa.setNome("Jose Roberto");
     LocalDate dt = LocalDate.of(2000, Month.JANUARY, 20);
    pessoa.setDataNascimento(dt);
    return ResponseEntity.ok(pessoa) ;
  }

}