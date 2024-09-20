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

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework utilizado para criar a aplicação como um microserviço.
- **Spring Scheduler**: Responsável pela criação de tarefas agendadas, como o envio de notificações no tempo programado.
- **Spring Data JPA**: Utilizado para a comunicação com o banco de dados de forma eficiente e com queries customizadas.
- **MySQL**: Banco de dados utilizado, que foi containerizado via **Docker**.
- **Docker**: Ferramenta para a containerização do banco de dados MySQL.
- **SLF4J**: Biblioteca de logging para garantir logs eficientes e consistentes durante a execução da aplicação.

---
