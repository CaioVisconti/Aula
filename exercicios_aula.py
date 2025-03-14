user_Thor = {"mysql", "CPU", "RAM", "SSD1", "Google"}
user_Thanos = {"LoL", "RAM", "CPU", "HD", "Google"}
user_CA = {"mysql", "LOL", "RAM", "CPU", "Firefox"}
user_TS = {"mysql", "CPU", "RAM", "SSD1", "Google"}

# Exercício 1:
uniao = user_Thanos.union(user_Thor, user_CA, user_TS)
print(uniao)

# Exercício 2:
interseccao = user_Thanos.intersection(user_Thor, user_CA, user_TS)
print(interseccao)

# Exercício 3:
diferenca = user_Thanos.difference(user_Thor, user_CA, user_TS)
print(diferenca)

# Exercício 4:
pertinencia_Lol = 'LoL' in user_Thanos
pertinencia_mysql = 'mysql' in user_CA
pertinencia_cpu = 'CPU' in user_Thor
pertinencia_ram = 'RAM' in user_TS