# Igual também serve pra criar parâmetro de funções
# a = 2 != a <- 2 (Preferível)
a <- 2

somar <- function(a, b = 2) {
  print(a + b)
}

somar(2)

# Criando vetor

vetor01 <- c('Bob', 'Tom', 'Mel')
vetor01

# Repetição
vetorRepete <- rep(c('Uva', 'Maçã'), 2)
vetorRepete

vetorRepete2 <- rep(c('Uva', 'Maçã'), each=3)
vetorRepete2

# Testando seq
sequencia01 = 1:10
sequencia01

sequencia02 = seq(1, 90, by=2)
sequencia02

sequencia03 = seq(1, 5, length.out = 10)
sequencia03

# Matriz
matriz01 = matrix(1:9, nrow = 3, ncol = 3)
matriz01
matriz01[1,]
matriz01[,1]

matriz02 <- matrix(seq(10, 90, by = 10), nrow = 3, ncol = 3)
matriz02

# Lista
lista01 <- list(c(10, 20, 30))
lista01

lista02 <- list(nomes = c('Tom', 'Bob'), idade = c(10, 20, 30, 40))
lista02
lista02$nomes
lista02$idade

listaTeste <- list(matrix(1:25, nrow = 5, ncol = 5))
listaTeste[1]
