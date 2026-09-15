# Máquina de Lavar — Aplicação Java

Projeto desenvolvido em **Java** para a implementação de uma classe `MaquinaDeLavar`, simulando o funcionamento de uma máquina de lavar roupas por meio do **controle de estados e regras de operação**.

O projeto foi desenvolvido como atividade acadêmica, com foco na aplicação de conceitos de **Programação Orientada a Objetos (POO)**, modelagem de classes, controle de estados, métodos e validação de regras de negócio.

---

## Autoras

Projeto desenvolvido em dupla por:

- **Daniela Venturi** — Engenharia de Software
- **Carolina Vitória de Brum** — Sistemas de Informação

As autoras são estudantes da **Univille — Universidade da Região de Joinville**, em cursos distintos da área de tecnologia.

---

## Objetivo do Projeto

O objetivo da atividade é desenvolver uma classe `MaquinaDeLavar` capaz de representar uma máquina de lavar roupas e controlar suas operações de acordo com o estado atual da máquina.

A aplicação deve impedir operações inválidas e permitir apenas ações compatíveis com cada estado de funcionamento.

O projeto busca demonstrar, na prática, a utilização de conceitos fundamentais de desenvolvimento de software, como:

- Programação Orientada a Objetos;
- Criação e utilização de classes e objetos;
- Encapsulamento;
- Métodos;
- Controle de estados;
- Regras de negócio;
- Validação de operações;
- Modelagem UML;
- Organização e versionamento de código com Git e GitHub.

---

## Funcionamentos da Máquina

A classe `MaquinaDeLavar` deve possuir, no mínimo, os seguintes comportamentos:

- Ligar a máquina;
- Desligar a máquina;
- Iniciar a lavagem;
- Pausar a lavagem;
- Retomar a lavagem;
- Iniciar a centrifugação;
- Abrir a tampa;
- Fechar a tampa.

A utilização dos métodos deve representar o ciclo completo de funcionamento da máquina, incluindo situações permitidas e restrições de acordo com o estado atual.

---

## 📋 Regras da Atividade

A classe deve respeitar as seguintes regras:

1. Uma máquina desligada não pode iniciar uma lavagem.
2. A lavagem só pode ser iniciada com a tampa fechada.
3. A tampa não pode ser aberta enquanto a máquina estiver lavando ou centrifugando.
4. Uma máquina desligada não pode ser pausada.
5. Uma lavagem pausada pode ser retomada.
6. A centrifugação só pode ser iniciada depois que a lavagem estiver concluída.
7. A máquina não pode ser desligada enquanto estiver lavando ou centrifugando.
8. Depois de concluída a centrifugação, a máquina pode ser desligada.
9. Uma máquina que já está ligada não deve ser ligada novamente.
10. Uma máquina que já está desligada não deve ser desligada novamente.


