# PROJETO: Sistema para Imobiliária

Projeto desenvolvido para conclusão do módulo Programação Orientada a Objetos II, do curso de JAVA da Let's Code by ADA. 

Este projeto fez a modelagem de classes para um sistema de uma imobiliária. Com a modelagem de :

. Imóvel como classe pai .
. Apartamento ou casa, como classes filhas de Imóvel. 
. Corretor, que extende de uma classe pai mais genérica, com informções de dados pessoais. 
. Locatário e Propietário, que também extende de uma classe pai dados pessoais.
. Um classe para criação de um endereço, que é aproveitada em todas as outras classes .
. Agenda de cada imóvel que armazena a informação para uma visita. 

Também foram construídas interfaces que modelam os imoveis, caso sejam alugados. Outra para gerar um contrato com os dados do imóvel, dos locatários e proprietários.

Objetos de serviço, que agendam vistas para cada imóvel e emissão de relatórios individuais ou em lote sobre os imóveis. 

Foi modelado ainda um repository, como banco de dados local para armazenar os imóveis para teste das classes e metódos. 

Os testes dinâmicos fazem a criação de um imóvel, com a inclusão do endereço, agenda e das pessoas: corretor, locatário e proprietário.
Também é testado a inclusão de uma visita na agenda, a geração de um contrato, e de relatórios sobre os imóveis. 

Projeto desenvolvido por: 
. Eliane Discacciati 
