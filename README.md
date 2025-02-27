# Verificador de Senhas

O **Verificador de Senhas** é uma aplicação em Java projetada para avaliar a força de uma senha com base em critérios pré-definidos, ajudando os usuários a criar senhas mais seguras.

## Como Funciona

1. O usuário insere uma senha no terminal.
2. O programa verifica a força da senha com base nos seguintes critérios:
   - Comprimento mínimo de 8 caracteres.
   - Inclusão de letras maiúsculas.
   - Inclusão de letras minúsculas.
   - Inclusão de números.
   - Inclusão de caracteres especiais (`@#$%^&*()-+_?<>`).
3. A senha recebe uma classificação de força:
   - **Fraca**: Atende a 2 ou menos critérios.
   - **Média**: Atende a 3 critérios.
   - **Forte**: Atende a 4 critérios.
   - **Muito Forte**: Atende a todos os critérios.

## Funcionalidades

- Avaliação de senhas com base em múltiplos critérios de segurança.
- Feedback claro e direto sobre a qualidade da senha.
- Fácil de usar e adaptável para diferentes regras de validação.

## Pré-requisitos

Para executar a aplicação, você precisa de:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (versão 8 ou superior).
- Um editor ou IDE, como:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/downloads/)
  - [VS Code](https://code.visualstudio.com/).

## Como Executar

1. **Clone o repositório ou copie o código fonte:**

   ```bash
   git clone https://github.com/seu-usuario/verificador-senhas.git
   cd verificador-senhas
