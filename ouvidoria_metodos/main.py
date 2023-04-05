from ouvidoria import *
from operacoes import *

conexao = abrirConexao()

opcao = 10
while opcao != 5:

    opcao = menu()

    if opcao == 1:
        consultaReclamacao = 'select * from reclamacao'
        listaReclamacao = listarBancoDados(conexao, consultaReclamacao)
        lista(listaReclamacao)

    elif opcao == 2:
        inserirReclamacao(conexao)

    elif opcao == 3:
        removerReclamacao(conexao)

    elif opcao == 4:
        pesquisarReclamacao(conexao)


    elif opcao != 5:
        print()
        print("Opção inválida")
        print()

print()
print("Até logo. Esperamos ter ajudado.")

encerrarBancoDados(conexao)