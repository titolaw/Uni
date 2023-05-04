from ouvidoria import *
from operacoes import *


def main():
    conexao = abrirConexao()

    opcao = 10
    while opcao != 5:

        opcao = menu()

        if opcao == 1:
            print("===== LISTA DE RECLAMAÇÕES =====")
            print()
            reclamacoes = lista(conexao)
            print(reclamacoes)
            print()

        elif opcao == 2:
            reclamacao = input("Digite a sua reclamacao: ")
            print()
            inserirReclamacao(conexao, reclamacao)
            print('A reclamação foi inserida com sucesso!')
            print()

        elif opcao == 3:
            excluir = input("Digite o código da reclamação a ser removida: ")
            print()
            remocao = removerReclamacao(conexao, excluir)
            print(remocao)
            print()

        elif opcao == 4:
            codigo = input("Digite o código da reclamação a ser pesquisada: ")
            print()
            reclamacaoPorCodigo = pesquisarReclamacao(conexao, codigo)
            print(reclamacaoPorCodigo)
            print()

        elif opcao != 5:
            print()
            print("Opção inválida")
            print()

    print()
    print("Até logo. Esperamos ter ajudado.")

    encerrarBancoDados(conexao)

if __name__ == "__main__":
    main()