# Segunda aula de R

# Primeiro Dataframe!
dataframe01 <- data.frame(
  Nomes = c("Bob", "Tom", "Mel"),
  Idade = c(10, 20, 30),
  Altura = c(1.4, 1.6, 1.8)
)

dataframe01
dataframe01$Nomes
dataframe01$Idade + 10
dataframe01$Altura

# Como pegar a classe de alguma variável
class(dataframe01)

procurar <- function() {
  x <- 0
  indice <- 0
  print("Insira o nome que queira pesquisar a posição: ")
  resposta <- readline()
  for(Nomes in dataframe01$Nomes) {
    x <- x + 1
    if(dataframe01[x,]$Nomes == resposta) {
      indice <- x
    }
  }
  print(indice)
}

procurar()
  
# Usando scan para ler números
idadeDigitada <- scan()
idadeDigitada

# Usando readLines para ler strings
nomeDigitado <- readLines()
nomeDigitado
