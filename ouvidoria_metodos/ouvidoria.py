from operacoes import *

def abrirConexao():
    conexao = abrirBancoDados('localhost', 'root', 'root', 'ouvidoria')
    return conexao

def menu():
    # Listar reclamacoes
    print("========== MENU ==========")
    print("1) Listar reclamações")
    print("2) Adicionar nova reclamação")
    print("3) Remover uma reclamação por código")
    print("4) Pesquisar uma reclamação por código")
    print("5) Sair")
    print()
    opcao = int(input("Bem vindo à ouvidoria. Escolha o número da sua opção: "))
    return opcao

def lista(listaReclamacao):


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


def inserirReclamacao(conexao):
    reclamacao = input("Digite a sua reclamacao: ")
    print()
    inserirReclamacao = 'insert into reclamacao(titulo) values(%s)'
    dados = (reclamacao,)

    insertNoBancoDados(conexao, inserirReclamacao, dados)

    print('A reclamação foi inserida com sucesso!')
    print()


def removerReclamacao(conexao):
    print()
    excluir = input("Digite o código da reclamação a ser removida: ")
    print()
    deletaCodigo = 'delete from reclamacao where id = %s'
    dados = (excluir,)
    excluirBancoDados(conexao, deletaCodigo, dados)
    print("Sua reclamação foi removida com sucesso.")
    print()


def pesquisarReclamacao(conexao):
    print()
    codigo = input("Digite o código da reclamação a ser pesquisada: ")
    print()
    consultaCodigo = 'select * from reclamacao where id = ' + codigo
    listaCodigo = listarBancoDados(conexao, consultaCodigo)

    if len(listaCodigo) == 0:
        print("Não existe reclamação com esse código")
    else:
        for reclamacao in listaCodigo:
            print(f"codigo: {reclamacao[0]} | reclamação: {reclamacao[1]}")
            print()
