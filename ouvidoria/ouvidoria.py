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

def lista(conexao):
    # checa a existência de dodos no banco e os lista
    consultaReclamacao = 'select * from reclamacao'
    listaReclamacao = listarBancoDados(conexao, consultaReclamacao)

    if len(listaReclamacao) == 0:
        return " - Nenhuma reclamação cadastrada no sistema."
    else:
        reclame = ""
        for reclamacao in listaReclamacao:
            reclame += f"código: {str(reclamacao[0])} | reclamação: {reclamacao[1]}\n"
        return reclame


def inserirReclamacao(conexao, reclamacao):
    # insere dados no banco
    inserirReclamacao = 'insert into reclamacao(titulo) values(%s)'
    dados = (reclamacao,)
    insertNoBancoDados(conexao, inserirReclamacao, dados)

def removerReclamacao(conexao, excluir):
    # sql a ser utilizado para a exclusão do dado
    deletaCodigo = 'delete from reclamacao where id = %s'
    dados = (excluir,)

    # retorna uma lista para checar se o dado a ser excluido existe no banco
    consultaCodigo = 'select * from reclamacao where id = ' + excluir
    listaCodigo = listarBancoDados(conexao, consultaCodigo)

    if len(listaCodigo) == 0:
        return "Não existe reclamação com esse código."
    else:
        excluirBancoDados(conexao, deletaCodigo, dados)
        return "Reclamação removida com sucesso."

def pesquisarReclamacao(conexao, codigo):
    # sql para pesquisar um item no banco de dados 
    consultaCodigo = 'select * from reclamacao where id = ' + codigo
    listaCodigo = listarBancoDados(conexao, consultaCodigo)

    if len(listaCodigo) == 0:
        return "Não existe reclamação com esse código."
    else:
        for reclamacao in listaCodigo:
            return f"código: {str(reclamacao[0])} | reclamação: {reclamacao[1]}\n"
