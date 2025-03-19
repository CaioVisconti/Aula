n <- 20000
p <- 200000

# Gerar número aleatório dentro do intervalo de 1-4
set.seed(1234)

# rnorm = gera números aleatórios
# n = campo amostral, 35 = média, 7 = desvio padrão
# round = arredonda
# abs = número absoluto (não negativo)
idade <- abs(round(rnorm(n, 35, 7), 0))
summary(idade)
l
hist(
  idade,
  ylab = "Frequência",
  xlab = "Idade(anos)"
)

altura <- abs(round(rnorm(n, 1.5, 0.1),2))
altura
summary(altura)

hist(altura, ylab = "Frequência", xlab = "Altura em metros")
