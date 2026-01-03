# Loja Virtual Completa – Back-end Java com Spring Boot

Projeto back-end desenvolvido em Java utilizando Spring Boot, com foco em simular um ambiente real de empresa, aplicando boas práticas de arquitetura, regras de negócio, segurança e integração com serviços externos.

Este projeto faz parte da minha formação em Back-End Java e está sendo desenvolvido com o objetivo de entrada no mercado como Desenvolvedor Java Júnior.

## Objetivo

Desenvolver uma API REST completa para uma loja virtual, abrangendo cadastro de usuários, produtos, vendas, pagamentos, emissão de nota fiscal e integrações externas, seguindo padrões utilizados no mercado.

## Arquitetura

O projeto segue uma arquitetura em camadas:

Controller  
Service  
Repository  
Database  

Cada camada possui uma responsabilidade clara, facilitando manutenção, testes e escalabilidade.

## Tecnologias Utilizadas

Java 17  
Spring Boot  
Spring Web  
Spring Data JPA  
Spring Security  
JWT  
Hibernate  
Maven  

Banco de Dados:  
PostgreSQL  
SQL avançado  
JPQL  
Triggers  
Flyway  

Testes:  
JUnit  
Mockito  

Integrações:  
APIs externas via RestTemplate  
API de Pagamento (PIX, Boleto e Cartão)  
WebHooks  
API de Nota Fiscal Eletrônica  
API de Transporte  
API de E-mail Marketing  

Infraestrutura:  
AWS  
HTTPS  
Certificados SSL  
Perfis de ambiente (dev e prod)

## Segurança

Autenticação e autorização utilizando JWT  
Controle de acesso por perfil  
Validação de dados  
Tratamento global de exceções

## Funcionalidades

CRUD completo das entidades  
Validação de CPF e CNPJ  
Exclusão lógica  
Consultas dinâmicas  
Relatórios com SQL avançado  
Processamento assíncrono  
Tarefas agendadas  
Envio de e-mails automáticos  
Upload e gerenciamento de imagens  
Fluxo completo de venda  

## Como Executar

Pré-requisitos:  
Java 17 ou superior  
Maven  
PostgreSQL  

Passos para execução:

git clone https://github.com/Brunobiu/Loja_Virtual_Completa
cd Loja_Virtual_Completa  
mvn clean install  
mvn spring-boot:run  

## Status do Projeto

Em desenvolvimento.  
O projeto está sendo evoluído continuamente conforme avanço na formação, com melhorias em arquitetura, testes e performance.

## Autor

Bruno Santana  
Desenvolvedor Back-End Java (em formação)

GitHub: https://github.com/Brunobiu
Portfólio: https://brunodev.site/

Observação:  
Projeto desenvolvido com foco em aprendizado prático e simulação de cenários reais encontrados no dia a dia de um desenvolvedor Java em ambiente corporativo.


## 📂 Estrutura do Projeto

![Estrutura do Projeto](docs/images/Diagrama%20Finalizado.PNG)
