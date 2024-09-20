# Microserviço de Agendamento de Notificações

## Descrição do Projeto

Este projeto é um **microserviço de agendamento de notificações**, desenvolvido com **Java Spring Boot**, utilizando **MySQL** como banco de dados e executado em um contêiner **Docker**. O serviço permite que os usuários solicitem o agendamento de notificações, consultem agendamentos existentes e façam o cancelamento de notificações previamente programadas. Também foram implementadas rotinas agendadas utilizando o **Spring Scheduler** e uma estrutura eficiente de logs com o **SLF4J** para monitorar o sistema.

---

## Funcionalidades Principais

1. **Solicitação de Agendamento de Notificações**:  
   Os usuários podem agendar notificações para uma data e hora futuras.

2. **Consulta de Agendamentos de Notificações**:  
   Os usuários podem consultar todos os agendamentos de notificações existentes no sistema.

3. **Cancelamento de Notificações**:  
   É possível cancelar uma notificação previamente agendada.

4. **Rotinas Agendadas**:  
   Utilização do **Spring Scheduler** para executar tarefas periódicas, como envio de notificações e limpeza de registros antigos.

---

## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![SLF4J](https://img.shields.io/badge/SLF4J-008080?style=for-the-badge&logo=slf4j&logoColor=white)

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework utilizado para criar a aplicação como um microserviço.
- **Spring Scheduler**: Responsável pela criação de tarefas agendadas, como o envio de notificações no tempo programado.
- **Spring Data JPA**: Utilizado para a comunicação com o banco de dados de forma eficiente e com queries customizadas.
- **MySQL**: Banco de dados utilizado, que foi containerizado via **Docker**.
- **Docker**: Ferramenta para a containerização do banco de dados MySQL.
- **SLF4J**: Biblioteca de logging para garantir logs eficientes e consistentes durante a execução da aplicação.

---

## Como Executar o Projeto

### Pré-requisitos:

- **Java 11+** instalado
- **Docker** instalado para containerizar o banco de dados MySQL
- **Maven** ou outra ferramenta de build Java
