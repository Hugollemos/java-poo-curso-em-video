# aula02 do curso de java POO

Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio da suas características, comportamentos e estado atual.

Exemplos:
```
Ex: Caneta {
  material: sim, é um material
  características: transparente, fina, tinta...
  comportamento: inanimado
  estado: pronto pra uso,
}

Ex: carro {
  material: sim, é um material
  características: rodas, portas, motor...
  comportamento: funcionando, direção fluída...
  estado: tanque cheio, bateria ligada...
}

Ex: show {
  material: não, é uma abstração
  características: pessoas, som, segurança...
  comportamento: cheio de pessoas, bebidas, banheirois...
  estado: planejado, comfirmado, fechado
}
```

posso ter varios objetos canetas, todo objeto tem um molde, um modelo, chamado de classe.

classe caneta

1.coisas que eu tenho(atributo):modelo, cor, ponta, carga, tampada...

2.coisas que eu faço(métodos):escrever,rabiscar,pintar,tampar,destampar

3.como eu estou agora(Estado):ponta fina, 40% de carga, destampada, sendo usada

todo objeto tem atributos, metodos e estados 

antes de criar uma caneta tenho que criar o molde,
antes de criar um objeto eu tenho que criar uma class

Exemplo básico de POO

classe Caneta
  modelo:caractere
  cor:caractere
  ponta:rel
  carga: inteiro
  tampada: Logico

  Metodo rabiscar()
  se (tampada) então
    Escreva("ERRO)
  senao
    Escreva("Rabisca)
  Fimse
  FimMetodo
    Metodo tampar()
      tampada = verdadeiro
    Fimmetodo

FimClasse

ATRIBUTOS
Modelo
cor
ponta
cargos
tampada
MÈTODOS
Escrever
Rabiscar
Pintar
Tampar
Destampar
ESTADO (sempre é dado no momento expesifico)
destampada
azul
90% de carga

# Instanciar
# instanciar é quando eu tenho uma classe e dela eu gero um objeto
c1 = nova caneta
c1 é um objeto, a palavra nova serve para instanciar um objeto apartir de uma classe
o que vem depois de nova é a classe que irei utilixzzar, o que vem antes do nova é o objeto que vai existir

# classe
define os atributos e metodos comuns que serao compartilhados por um objeto
# Objeto
 é uma instância de uma classe
# Abstração, encapsulamento e herança e polimorfismo: pilares da POO


Abstração: é o ponto de partida para a criação de programas utilizando POO. trata-se da capacidade de extrair dos personagens ou dois itens presentes no contexto, suas principais caracteristicas, criado, dessa frma objetos. portanto a captura das principais caracteristicas do personagem ou item.

classe celular

ATRIBUTOS 
cor
modelo
camerâ
capa
sistema
app
tem chip
Metodos
jogo
faço ligação
mando mensagem
tiro foto 
carrego
ESTADO
65% da bateria
ligado
aranhado, esquentando
conectado ao wifi

classe carregador

ATRIBUTOS
cor
passa corrente elétrica
entrada USB
marca
METODOS
carrega celular
carrega lanternar
ESTADO
Zero corrente
arranhado
cheiro de queimado

classe corrida

ATRIBUTOS
longo percuso
cansativo
muitas pessoas

 METODOS
 faixa de chegada 
 premios 

 ESTADO
 chuvendo
 cansativo
disputa

Classe Viajar 

ATRIBUTOS
longa jornada
cansativa
destino

METODOS
culturas
pessoas novas
expeciencia nova

ESTADO
sequindo o planejamento
imprevistos
rota
alegria