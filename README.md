# 🚌🚇 Sistema de Gestão de Transporte Público

Este é um mini projeto avaliativo desenvolvido em Java com foco em Programação Orientada a Objetos (POO), utilizando herança, polimorfismo e abstração. O sistema permite o cadastro, exibição e operação de veículos de transporte público, como ônibus e metrôs.

---

## 🧠 Objetivo

Simular um sistema básico de gestão de veículos de transporte público que:

- Permite cadastrar veículos (ônibus e metrôs)
- Lista todos os veículos ou por tipo
- Executa ações específicas (abrir portas, embarcar passageiros)
- Mostra o total de veículos cadastrados por tipo

---

## 📦 Estrutura do Projeto

- **Classe abstrata `Veiculo`**
  - Atributos: `id`, `marca`, `ano`
  - Método abstrato: `exibirDados()`

- **Classe `Onibus`** (herda de `Veiculo`)
  - Atributos: `capacidadePassageiros`, `tipo` (ex: articulado, micro-ônibus)
  - Métodos: `abrirPortas()`, `fecharPortas()`, `exibirDados()`

- **Classe `Metro`** (herda de `Veiculo`)
  - Atributos: `numeroVagoes`, `temArCondicionado`
  - Métodos: `embarcarPassageiros(int qtd)`, `desembarcarPassageiros(int qtd)`, `exibirDados()`

- **Classe `Garagem`**
  - Gerencia uma lista de veículos
  - Métodos: `adicionarVeiculo()`, `listarTodos()`, `listarPorTipo()`, `contarVeiculos()`, `buscarPorId()`

- **Classe principal `ativ_avalia`**
  - Interface de menu em terminal para interação com o sistema

---

## ▶️ Como Executar

1. Certifique-se de ter o JDK instalado.
2. Compile todos os arquivos `.java`:

```bash
javac *.java
```

3. Execute a classe principal:

```bash
java ativ_avalia
```

---

## 💻 Funcionalidades do Menu

```
1. Cadastrar Ônibus
2. Cadastrar Metrô
3. Listar todos os veículos
4. Listar veículos por tipo
5. Executar ação específica (abrir portas / embarcar passageiros)
6. Mostrar total de veículos por tipo
7. Sair
```

---

## 🛠️ Tecnologias

- Linguagem: **Java**
- Paradigmas: **POO (Programação Orientada a Objetos)**

---

## 📚 Conceitos de POO Aplicados

- **Abstração:** Classe `Veiculo` abstrata com método `exibirDados()`
- **Herança:** `Onibus` e `Metro` herdam de `Veiculo`
- **Polimorfismo:** Uso de `exibirDados()` com comportamento específico por tipo
- **Encapsulamento:** Uso de atributos privados com construtores

---

## ✍️ Autor

Desenvolvido por **Willian Marques* — Projeto acadêmico para fins de avaliação.
