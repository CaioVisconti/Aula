# Vetor:
lista_users = ["Bob", "Tom", "Ian"] # Mutáveis, possui ordem, pode ter duplicados

# Tupla:
tupla_users = ("Bob", "Tom", "Ian") # Imutáveis, possui ordem, pode ter duplicados

# Set:
cojunto_users = set ("Bob", "Tom", "Ian") # Conjunto mutável, mas elementos não. Não possui ordem e não permite duplicação

# Dicionário:
# dic = {nome: "Bob"}

## Vamos focar nos conjuntos
frutas_user_01 = {"Uva", "Maçã", "Morango", "Uva"}
frutas_user_02 = {"Uva", "Laranja", "Melão"}
frutas_user_03 = {"Maçã", "Morango", "Abacaxi", "Uva"}
frutas_user_04 = set(["Amora", "Kiwi"])

print("Frutas user 01: ", frutas_user_01)
print("Frutas user 02: ", frutas_user_02)
print("Frutas user 03: ", frutas_user_03)

# União
# uniao_frutas_user01_02 = frutas_user_01 | frutas_user_02
uniao_frutas_user_01_02 = frutas_user_01.union(frutas_user_02)
print("União frutas user 01 e 02: ", uniao_frutas_user_01_02)

# Intersecção
# interseccao_frutas_user_01_02 = frutas_user_01 & frutas_user_02
interseccao_frutas_user_01_02 = frutas_user_01.intersection(frutas_user_02)
print("Intersecção frutas users 01 e 02: ", interseccao_frutas_user_01_02)