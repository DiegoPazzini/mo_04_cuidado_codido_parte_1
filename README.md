# Conta Bancária em Java

Este projeto consiste em uma implementação simples de um sistema de contas bancárias em Java, utilizando conceitos de programação orientada a objetos. O código está organizado em três classes principais: ContaBancaria, ContaCorrente, e ContaPoupanca.

A classe abstrata ContaBancaria estabelece a estrutura básica para todas as contas bancárias, fornecendo um campo para o saldo e um método abstrato temSaldoParaDebitar que as subclasses devem implementar.

A classe ContaCorrente herda de ContaBancaria e adiciona um campo para o limite de saldo negativo permitido. A implementação do método abstrato leva em consideração esse limite ao verificar se há saldo suficiente para um débito.

A classe ContaPoupanca também herda de ContaBancaria, mas a implementação do método abstrato é mais simples, verificando apenas se o saldo é suficiente para um débito.

Além disso, há uma classe de utilidade chamada ComplexidadeContaBancaria, que contém métodos para avaliar se uma conta possui saldo suficiente com base em polimorfismo, proporcionando uma abordagem mais flexível e menos propensa a alterações no futuro.

O projeto demonstra conceitos importantes como herança, abstração, polimorfismo, encapsulamento e modularidade. A estrutura das classes facilita a extensão para novos tipos de contas bancárias no futuro. O código é organizado, seguindo boas práticas de programação orientada a objetos.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
