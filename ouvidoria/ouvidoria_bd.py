from operacoes import *

opcao = 10
conexao = abrirBancoDados('localhost', 'root', 'root', 'ouvidoria')

while opcao != 5:

    # Listar reclamacoes
    print("========== MENU ==========")
    print("1) Listar reclamações")
    print("2) Adicionar nova reclamação")
    print("3) Remover uma reclamação por código")
    print("4) Pesquisar uma reclamação por código")
    print("5) Sair")
    print()
    opcao = int(input("Bem vindo à ouvidoria. Escolha o número da sua opção: "))

    if opcao == 1:
        consultaReclamacao = 'select * from reclamacao'
        listaReclamacao = listarBancoDados(conexao, consultaReclamacao)

        if len(listaReclamacao) == 0:
            print()
            print(" - Nenhuma reclamação cadastrada no sistema")
            print()
        else:
            print("===== LISTA DE RECLAMAÇÕES =====")
            print()
            for reclamacao in listaReclamacao:
                print(f"codigo: {reclamacao[0]} | reclamação: {reclamacao[1]}")
            print()

    elif opcao == 2:
        reclamacao = input("Digite a sua reclamacao: ")
        print()
        inserirReclamacao = 'insert into reclamacao(titulo) values(%s)'
        dados = (reclamacao,)

        insertNoBancoDados(conexao, inserirReclamacao, dados)

        print('A reclamação foi inserida com sucesso!')
        print()

    elif opcao == 3:
        print()
        excluir = input("Digite o código da reclamação a ser removida: ")
        print()
        deletaCodigo = 'delete from reclamacao where id = %s'
        dados = (excluir,)
        excluirBancoDados(conexao, deletaCodigo, dados)
        print("Sua reclamação foi removida com sucesso.")
        print()


    elif opcao == 4:
        print()
        codigo = input("Digite o código da reclamação a ser pesquisada: ")
        print()
        consultaCodigo = 'select * from reclamacao where id = ' + codigo
        listaCodigo = listarBancoDados(conexao,consultaCodigo)

        if len(listaCodigo) == 0:
            print("Não existe reclamação com esse código")
        else:
            for reclamacao in listaCodigo:
                print(f"codigo: {reclamacao[0]} | reclamação: {reclamacao[1]}")
                print()


    elif opcao != 5:
        print()
        print("Opção inválida")
        print()

print()
print("Até logo. Esperamos ter ajudado.")

encerrarBancoDados(conexao)
