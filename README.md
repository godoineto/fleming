# Fleming - Sistema de Gestão Hospitalar
> O objetivo do projeto é criar uma API para organizar um sistema público de saúde.


**O problema do SUS**

O Sistema Único de Saúde (SUS) é um dos maiores e mais complexos sistemas de saúde pública do mundo, abrangendo desde o simples atendimento para avaliação da pressão arterial, por meio da Atenção Básica, até o transplante de órgãos, garantindo acesso integral, universal e gratuito para toda a população do país. Com a sua criação, o SUS proporcionou o acesso universal ao sistema público de saúde, sem discriminação. A atenção integral à saúde, e não somente aos cuidados assistenciais, passou a ser um direito de todos os brasileiros, desde a gestação e por toda a vida, com foco na saúde com qualidade de vida, visando a prevenção e a promoção da saúde. O objetivo desse projeto é criar uma ferramenta para auxiliar o SUS, evitar desperdício e potencializar os recursos a partir dos pacientes.


**Recursos técnicos:**

- Banco de dados: MongoDB;
- API: Java com Spring Boot;
- Testes: JUnit;


**Contexto do Fleming:**

Todo hospital tem um estoque contendo diversos produtos.
Um estoque tem produtos e suas respectivas quantidades.
Dentro do estoque também tem banco de sangue.
O hospital também possui leitos.
Ao encontrar um paciente é importante o recomendar para um hospital mais próximo e que tenha vaga disponível.
Caso o hospital precise de um produto, por exemplo, um banco de sangue, é importante fazer o envio do hospital mais próximo ao local.
Caso o hospital tenha apenas 4 itens ou 4 litros ele terá apenas o suficiente para o próprio hospital.


**Exemplos de chamadas:**

A partir da API que gerencia os hospitais dentro do SUS o usuário poderá:
Cadastrar o hospital.
A partir da localização do paciente indicar o hospital mais próximo.
Realizar check-in/ check-out do paciente no hospital.
Verificar quantos leitos disponíveis no hospital.
Cadastrar produtos e suas respectivas quantidades.
Cadastrar e gerenciar banco de sangue.

**Obtém as informações de um hospital:**
> GET: /v1/hospitais/{id}

> { nome: "string", endereco: "string", leitos: "integer", leitosDisponiveis: "integer" }

**Obtém as informações dos produtos no estoque de um hospital:**
> GET: /v1/hospitais/{id}/estoque

> [{ nome: "string", descricao: "string", quantidade: "integer" }]

**Obtém as informações de um produto específico no estoque:**
> GET: /v1/hospitais/{id}/estoque/{produto}

> { nome: "string", descricao: "string", quantidade: "integer" }

**Obtém os nomes dos pacientes de um hospital:**
> GET: /v1/hospitais/{id}/pacientes

> [{ id: "integer", nome: "string" }]

**Obtém todas as informações de um paciente especifico:**
> GET: /v1/hospitais/{id}/pacientes/{paciente}

> [{ id: "integer", nome: "string", cpf: "string", nascimento: "date", sexo: "string", dataEntrada: "date" }]
