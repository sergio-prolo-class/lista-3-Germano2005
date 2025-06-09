# Correção

| Questão     | Legibilidade | Diagramas | P1 | P2 | P3 | Total |
|-------------|--------------|-----------|----|----|----|-------|
| Nota máxima | 10           | 10        | 20 | 25 | 35 | 100   |
| Nota        | 8            | 6         | 18 | 20 | 32 | 84    |

## Diagramas

- Multiplicidades vazias nos três diagramas, ausência de associações de tipos complexos (agregação, composição, dependência?)
- Faltam métodos e atributos para considerar esses diagramas sob perspectiva de implementação
- P1:
  - Gerenciador tem acesso à * User, mas não tem um atributo que guarda essas referências?
- P2:
  - Atributos de RegistroFila do tipo Solicitação? Não Queue<Solicitacao>? Estranho
  - A Solicitacao não tem acesso ao Cliente? nem o contrário? Estranho
- P3:
  - Exigências pesadas:
    - Gerenciador necessita de pelo menos um Autor, um Livro e um Leitor já existentes para ser construído?
    - Todo autor registrado tem que estar na autoria de ao menos um livro?
    - O que é o Relatorio do Gerenciador da biblioteca?

## P1

- Gerenciador não é usado como classe estática, como exigido pela descrição do problema
- SoC: Gerenciador com println, que deveria ser preocupação apenas do App
- Encapsulamento vazado:
  - Gerenciador.getUsers() retorna uma referência ao atributo privado users
  - Assim, qualquer outra classe pode alterar seu conteúdo
- Cadastro errado:
  - Você está certo em comparar os logins no User.equals(), mas esqueceu de usar lower()
  - Assim, dois logins "user" e "User" vão ser considerados diferentes

### Requisitos Funcionais
- [x] Cadastrar novos usuários
- [x] Remover usuários
- [x] Listar os logins
- [x] Autenticar usuários

## P2

- atributo todasSolicitacoes é desnecessário, dado que é igual a atendidas + fila
- diagrama de classes não representa o vínculo duplo entre RegistroFila e Solicitação (solicitacoesAtendidas e filaEspera)
- não deverias deixar o atributo que descreve uma Solicitacao dentro da classe de enumeração, ele pertence a Solicitacao
- fizeste bem em implementar equals e hashCode de cliente, mas infelizmente não usas isso em nenhum lugar.

### Requisitos Funcionais
- [x] Registrar novas solicitações
- [ ] Listar os telefones dos clientes registrados
- [x] Imprimir o nome do próximo cliente
- [x] Atender o próximo cliente
- [x] Listar os nomes dos clientes já atendidos
- [x] Listar os telefones dos clientes em espera
- [x] Gerar um relatório estatístico
- [x] ... total de solicitações registradas, atendidas, em espera
- [x] ... distribuição percentual das solicitações por categoria

## P3

- por que tudo é lista?
- cada livro só pode ter um autor
  - identificado pela classe de associação AutorLivro
  - esse tipo de classe deve ser usada nas associações de muitos para muitos
  - Livro deveria ter um conjunto de AutorLivro
  - podes observar essa característica no seu próprio AppBiblioteca, dado que Em busca de nós mesmos só fica com 1 autor
- O número de cópias de um livro na biblioteca não deve ser atributo do livro, e sim da biblioteca
- objetos não possuem equals e hashCode definido
  - logo, um método como registrarEmprestimo pode emprestar o mesmo livro para um leitor duas vezes
  - desde que existam dois objetos Livro que representem o mesmo livro
  - deverias usar o ISBN para impedir isso de acontecer

### Requisitos Funcionais
- [x] Cadastrar autores
- [x] Cadastrar livros
- [x] Cadastrar leitores
- [x] Registrar empréstimos de livros para leitores
- [x] ... pelo menos uma cópia
- [ ] ... leitor não tenha esse livro
- [x] ... leitor possua no máximo 5 livros emprestados
- [x] Listar autores em ordem alfabética
- [x] Listar leitores em ordem alfabética
- [x] Listar leitores por id
- [x] Listar livros por título
- [x] Listar livros por autor
- [x] Listar livros por ISBN
- [x] Listar empréstimos por data
- [x] Listar empréstimos de um leitor, por data