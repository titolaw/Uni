lista = []
opcao = 10
while opcao != 5:

    # Listar reclamacoes
    print("========== MENU ==========")
    print("1) Listar reclamações")
    print("2) Adicionar nova reclamação")
    print("3) Remover uma reclamação")
    print("4) Pesquisar uma reclamação por código")
    print("5) Sair")
    print()
    opcao = int(input("Bem vindo à ouvidoria. Escolha o número da sua opção: "))

    # Listar reclamações
    if opcao == 1:
        if len(lista) == 0:
            print()
            print(" - Nenhuma reclamação cadastrada no sistema")
            print()
        else:
            print("===== LISTA DE RECLAMAÇÕES =====")
            print()
            for index, item in enumerate(lista):
                print(f"{index+1}) {item}")
            print()

    # Adcionar novas reclamações
    elif opcao == 2:
        reclame = input("Digite sua reclamação: ")
        lista.append(reclame)
        print()
        print("Reclamação cadastrada com sucesso")
        print(f"O código da reclamação é {len(lista)}")
        print()

    # Remover uma reclamação
    elif opcao == 3:
        for index, item in enumerate(lista):
            print(f"{index+1}) {item}")
        remocao = int(input("Digite o número da reclamação a ser removida: "))
        if remocao <= 0 or remocao > len(lista):
            print()
            print("Código inválido")
        else:
            lista.pop(remocao - 1)
            print()

    # Pesquisar uma reclamação por código
    elif opcao == 4:
        pesquisa = int(input("Digite o número da reclamação a ser pesquisada: "))
        if pesquisa <= 0 or pesquisa > len(lista):
            print("Código inválido")
            print()
        else:
            print()
            print(f"a reclamação pesquisada é: {lista[pesquisa - 1]}")
            print()

    # Opção inválida e saída
    elif opcao != 5:
        print()
        print("Opção inválida")
        print()

print("sair")
