📝 Sistema de Gestão de Veículos de Transporte Público
Projeto em Java que gerencia veículos (ônibus e metrôs) usando POO, herança e polimorfismo.

📌 Descrição
Este sistema permite:
✅ Cadastrar ônibus e metrôs
✅ Listar veículos (todos ou por tipo)
✅ Executar ações específicas (abrir portas, embarcar passageiros)
✅ Contar veículos por categoria

Desenvolvido como exercício de Programação Orientada a Objetos (POO) com foco em:

Classes abstratas

Herança (Onibus e Metro herdam de Veiculo)

Polimorfismo (método exibirDados() sobrescrito)

🛠 Tecnologias
Java (JDK 11+)

Eclipse/IntelliJ/VSCode (qualquer IDE Java)

⚙️ Como Executar
Clone o repositório:

bash
Copy
git clone https://github.com/seu-usuario/sistema-transporte.git
Abra o projeto na sua IDE Java favorita.

Execute a classe atAvaliativa.java (contém o método main).

🚀 Funcionalidades
1. Menu Principal
Copy
=== Menu de Opções ===
1. Cadastrar Ônibus
2. Cadastrar Metrô
3. Listar todos os veículos
4. Listar veículos por tipo
5. Executar ação específica
6. Mostrar total de veículos por tipo
7. Sair
2. Cadastro de Veículos
Ônibus: ID, marca, ano, capacidade, tipo (articulado/convencional/micro-ônibus).

Metrô: ID, marca, ano, número de vagões, ar-condicionado (sim/não).

3. Ações Específicas
Ônibus: abrirPortas(), fecharPortas().

Metrô: embarcarPassageiros(qtd), desembarcarPassageiros(qtd).

📂 Estrutura do Código
Classe	Descrição
Veiculo	Classe abstrata (não pode ser instanciada diretamente).
Onibus	Herda de Veiculo e implementa ações de ônibus.
Metro	Herda de Veiculo e implementa ações de metrô.
Garagem	Gerencia a lista de veículos (ArrayList<Veiculo>).
atAvaliativa	Classe principal com menu interativo.
📊 Exemplo de Saída
Listagem de Ônibus
Copy
[Ônibus]  
ID: 1  
Marca: Mercedes  
Ano: 2020  
Capacidade: 50  
Tipo: articulado  
Contagem de Veículos
Copy
Total de ônibus: 3  
Total de metrôs: 2  
📜 Licença
Este projeto está sob a licença MIT.

Desenvolvido por [Seu Nome]
📧 Contato: seu-email@exemplo.com
🔗 GitHub: github.com/seu-usuario

💡 Dica: Se quiser evoluir o projeto, considere adicionar persistência em arquivo ou interface gráfica! 🚀
