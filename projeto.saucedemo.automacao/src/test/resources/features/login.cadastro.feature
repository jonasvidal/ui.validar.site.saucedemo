@regressivo

Feature: Realizar login

Como usuario do site saucedemo
Quero preencher dados
Para realizar login

Background: acessar o site
Given que esteja no site saucedemo

Scenario: login com dados validos
When preencher dados validos
Then valido login com sucesso


Scenario: login com dados invalidos
When preencher dados invalidos
Then valido retorno da mensagem dados invalidos


Scenario: login com dados em branco
When deixar dados em branco
Then valido retorno da mensagem preecher campos

Scenario: login com username errado
When preencher username errado
Then valido retorno da mensagem dados invalidos

Scenario: login com senha errada
When preencher senha errada
Then valido retorno da mensagem dados invalidos

Scenario: login com username em branco
When deixar username em branco
Then valido retorno da mensagem preencher campos


Scenario: login com senha em branco
When deixar senha em branco
Then valido retorno da mensagem preencher senha