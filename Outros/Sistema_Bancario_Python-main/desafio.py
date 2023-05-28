menu = """

[d] Depositar
[s] Sacar
[e] Extrato
[q] Sair

=> """

saldo = 0
limite = 500
extrato = ""
numero_saques = 0
LIMITE_SAQUES = 3

while True:

    opcao = input(menu)

    if opcao == "d":
        valor = float(input("Informe o valor do deposito: "))

        if valor > 0:
            saldo += valor
            extrato += f"Deposito: R$ {valor:.2f}\n"

        else:
            print("operação falhou! O Valor informado é invalido.")

    elif opcao == "s":
        valor = float(input("Informe o valor do Saque: "))

        excedeu_saldo = valor > saldo

        excedeu_limete = valor > limite

        excedeu_saques = numero_saques >= LIMITE_SAQUES

        if excedeu_saldo:
            print("Operação falhou! você não tem saldo suficiente.")

        elif excedeu_limete:
            print("Operação falhou! o valor do saque excede o limite.")

        elif excedeu_saques:
            print("Operação falhou! Numero maximo de sauqes excedido.")

        elif valor > 0:
            saldo -= valor
            extrato += f"Saque: R$ {valor: .2f}\n"
            numero_saques += 1

        else:
           print("Operação falhou! O valor informado é invalido.")

    elif opcao == "e":
        print("\n============== EXTRATO ==============")
        print("Não foram realizados movimentações." if not extrato else extrato)
        print(f"\nSaldo: R$ {saldo:.2f}")
        print("=======================================")

    elif opcao == "q":
        break

    else:
        print("Opção invalida, por favor selecione novamente a operação desejada")                           
