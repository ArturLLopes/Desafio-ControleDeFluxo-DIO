# Desafio Controle de Fluxo - DIO

Este repositório contém a solução para o desafio de **Controle de Fluxo** proposto pela Digital Innovation One (DIO), focado no aprendizado e prática de estruturas condicionais e de repetição em Java.

## 📋 Sobre o Desafio

O desafio tem como objetivo praticar conceitos fundamentais de programação Java, especificamente:

- Estruturas condicionais (`if`, `else`, `switch`)
- Estruturas de repetição (`for`, `while`, `do-while`)
- Tratamento de exceções
- Validação de entrada de dados
- Boas práticas de programação

## 🎯 Objetivos de Aprendizado

- Compreender e aplicar estruturas de controle de fluxo
- Implementar validações de entrada
- Criar tratamento adequado de exceções
- Desenvolver lógica de programação estruturada
- Praticar conceitos de programação orientada a objetos

## 🚀 Funcionalidades

O projeto implementa as seguintes funcionalidades:

### Contador com Validação
- Recebe dois números inteiros como parâmetros
- Valida se o primeiro número é menor que o segundo
- Executa um loop de contagem entre os números
- Trata exceções personalizadas para entradas inválidas

### Tratamento de Exceções
- Implementa exceção customizada `ParametrosInvalidosException`
- Fornece mensagens de erro claras e informativas
- Garante a robustez do programa

## 📁 Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       ├── Contador.java              # Classe principal com lógica de contagem
│       └── ParametrosInvalidosException.java  # Exceção personalizada
└── README.md
```

## 💻 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse)

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/ArturLLopes/Desafio-ControleDeFluxo-DIO.git
   ```

2. **Navegue até o diretório do projeto**
   ```bash
   cd Desafio-ControleDeFluxo-DIO
   ```

3. **Compile o código**
   ```bash
   javac src/*.java
   ```

4. **Execute o programa**
   ```bash
   java -cp src Contador
   ```

## 🔧 Exemplo de Uso

```java
// Exemplo de entrada válida
Primeiro parâmetro: 12
Segundo parâmetro: 30

// Saída esperada:
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18

// Exemplo de entrada inválida
Primeiro parâmetro: 30
Segundo parâmetro: 12

// Saída esperada:
O segundo parâmetro deve ser maior que o primeiro
```

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **JDK** - Kit de desenvolvimento Java
- **Scanner** - Para captura de entrada do usuário
- **Exceções personalizadas** - Para tratamento de erros

## 📚 Conceitos Aplicados

### Estruturas de Controle
- **Condicionais**: Validação de parâmetros de entrada
- **Loops**: Iteração controlada para impressão sequencial
- **Tratamento de Exceções**: Gerenciamento de erros

### Boas Práticas
- Nomenclatura clara e descritiva
- Separação de responsabilidades
- Tratamento adequado de exceções
- Código limpo e bem estruturado

## 🤝 Contribuições

Este projeto faz parte de um desafio educacional da DIO. Sugestões e melhorias são sempre bem-vindas!

### Como Contribuir

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request



## 👨‍💻 Autor

**Artur L. Lopes**
- GitHub: [@ArturLLopes](https://github.com/ArturLLopes)



*Desenvolvido com ❤️ durante o bootcamp da DIO*
