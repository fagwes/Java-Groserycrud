#language: pt

@teste
Funcionalidade: Adicionar usuario
 Como usuario eu quero criar uma conta

  @adicionar
  Cenario: Adicionar um usuario
    Dado que selecione o bootstrap v4
    E clico em add customer
    E preencho os dados
    Quando clicar em salvar
    Entao validamos a mensagem

 