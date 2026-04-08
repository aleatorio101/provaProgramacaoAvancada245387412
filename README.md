# provaProgramacaoAvancada245387412
 
- para executar o projeto é necessário realizar o gitclone do repositório por meio do comando git clone https://github.com/aleatorio101/provaProgramacaoAvancada245387412.git
- após o clone é necessário instalar as dependências do maven
- quando utilizar o comando para rodar o projeto uma porta ficara aberta esperando requisições que por padrão é a porta 8080
- para as requisições do crud completo são feitas na seguinte rota localhost:8080/api/produtos
- A requisição de criação do produto tem que ser feita com o método POST localhost:8080/api/produtos e enviando o body
  
{
"nomeProduto" : "Feijao",
"descricaoProduto": "saco de feijao",
"precoProduto": 123,
"status": "DISPONIVEL"

}

- O id é numerado automáticamente e caso de tudo certo a requisição retorna 201 created
- a requisição para listar todos os produtos é feita com o método GET localhost:8080/api/produtos possuindo o seguinte retorno:
  
  {
        "descricaoProduto": "saco de feijao",
        "id": 1,
        "nomeProduto": "Feijao",
        "precoProduto": 123.0,
        "status": "DISPONIVEL"
    },
  
    {
        "descricaoProduto": "saco de arroz",
        "id": 2,
        "nomeProduto": "ARROZ",
        "precoProduto": 123.0,
        "status": "ESGOTADO"
    }

- para requisição que lista apenas um produto específico é necessária a requisição para GET localhost:8080/api/produtos/id <- aqui altera para o id do produto e retornando apenas um produto ex:
  
  {
        "descricaoProduto": "saco de feijao",
        "id": 1,
        "nomeProduto": "Feijao",
        "precoProduto": 123.0,
        "status": "DISPONIVEL"
    }
  
- caso não seja encontrado retorna 404 notfund
- para requisição que atualiza o produto é necessário fazer a requisição PUT localhost:8080/api/produtos/id <- aqui o id do produto a ser alterado e com corpo de requisição com as alterações ex:
  
  {
"nomeProduto" : "farinha",
"descricaoProduto": "saco de farinha",
"precoProduto": 123,
"status": "INATIVO"

}

- Para deletar o produto é necessário fazer a requisição para DELETE localhost:8080/api/produtos/id <- aqui o id do produto a ser deletado
- caso o produto exista e for corretamente deletado é retornado status 204 no content mas caso ele não exista retorna 404 not fund
